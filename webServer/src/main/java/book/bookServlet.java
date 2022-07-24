package book;

import Obj.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "bookServlet", value = "/bookServlet")
public class bookServlet extends HttpServlet {
    private PreparedStatement preparedStatement;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        initializeJDBC();
        try {
            preparedStatement.setString(1, request.getParameter("bookId"));
            ResultSet result =  preparedStatement.executeQuery(); // 會回傳一個值
            Book book = null;
            if(result.next()){
                book = new Book();
                book.setBookId(result.getInt("bookId"));
                book.setName(result.getString("name"));
                book.setPrice(result.getInt("price"));
                book.setAuthor(result.getString("author"));
            }
            request.setAttribute("book", book);
            request.getRequestDispatcher("/book.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void initializeJDBC(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnJAVA","ashi","20190609");

            preparedStatement = conn.prepareStatement("SELECT * FROM book WHERE bookId = ?");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
