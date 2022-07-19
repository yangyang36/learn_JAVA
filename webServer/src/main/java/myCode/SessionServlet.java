package myCode;


import Obj.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "CookieServlet", value = "/CookieServlet")
public class SessionServlet extends HttpServlet {
    private PreparedStatement preparedStatement;
    public void init() throws ServletException{
        initializeJDBC();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String author = request.getParameter("author");

        Book book = new Book();
        book.setBookId(Integer.parseInt(bookId));
        book.setName(name);
        book.setPrice(Integer.parseInt(price));
        book.setAuthor(author);

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("book", book);

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("You entered the following data :");
        out.println("<p>Book Id: " + bookId + "</p>");
        out.println("<br>");
        out.println("<p>Book Name: " + name + "</p>");
        out.println("<br>");
        out.println("<p>Book Price: " + price + "</p>");
        out.println("<br>");
        out.println("<p>Book Author: " + author + "</p>");
        out.println("<br>");

        out.println("<form method=\"POST\" action=\"/sessionRegis\">");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</form>");

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Book book = (Book) httpSession.getAttribute("book");


        try {
            storeBook(book.getBookId(), book.getName(), book.getPrice(), book.getAuthor());
            PrintWriter out = response.getWriter();
            out.println("Book has been stored in the DB.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initializeJDBC(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnJAVA","ashi","20190609");

            preparedStatement = conn.prepareStatement("insert into book (bookID, name, price, author) values (?, ?, ?, ?)");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void storeBook(int id, String name, int price, String author){
        try {
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3,price);
            preparedStatement.setString(4, author);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
