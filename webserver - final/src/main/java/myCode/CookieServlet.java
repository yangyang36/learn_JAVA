package myCode;

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
public class CookieServlet extends HttpServlet {

    private PreparedStatement preparedStatement;

    @Override
    public void init() throws ServletException {
        initializeJDBC();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        String bookId = request.getParameter("bookId");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String author = request.getParameter("author");

        Cookie cookieBookId = new Cookie("bookId", bookId);
        Cookie cookieName = new Cookie("bookname", name);
        Cookie cookiePrice = new Cookie("price", price);
        Cookie cookieAuthor = new Cookie("author", author);
        response.addCookie(cookieBookId);
        response.addCookie(cookieName);
        response.addCookie(cookiePrice);
        response.addCookie(cookieAuthor);

        PrintWriter out = response.getWriter();

        out.println("You entered the following data:");
        out.println("<p>Book Id:" + bookId + "</p>");
        out.println("<br />");
        out.println("<p>Book Name:" + name + "</p>");
        out.println("<br />");
        out.println("<p>Book Price:" + price + "</p>");
        out.println("<br />");
        out.println("<p>Book Author:" + author + "</p>");
        out.println("<br />");
        
        out.println("<form method=\"post\" action=\"/cookieRegis\">");
        out.println("<input type=\"submit\" value=\"Confirm\">");
        out.println("</form>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = 0;
        String name = null;
        int price = 0;
        String author = null;
        
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("bookId")) {
                bookId = Integer.parseInt(cookie.getValue());
            }
            if (cookie.getName().equals("bookname")) {
                name = cookie.getValue();
            }
            if (cookie.getName().equals("price")) {
                price = Integer.parseInt(cookie.getValue());
            }
            if (cookie.getName().equals("author")) {
                author = cookie.getValue();
            }
        }
        
        try {
            storeBook(bookId, name, price, author);
            PrintWriter out = response.getWriter();
            out.println("Book " + name + " has been stored in the database.");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initializeJDBC() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wilsonvideodb", "wilsonvideo", "password");
            System.out.println("Database connected...");

            preparedStatement = conn.prepareStatement("insert into book " + "(bookId, name, price, author) values (?, ?, ?, ?);");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private void storeBook(int id, String name, int price, String author) {
        try {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, price);
            preparedStatement.setString(4, author);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
