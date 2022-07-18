package myCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Tryervlet", value = "/Tryervlet")
public class TryServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        super.init();
        System.out.println("init method ...");
//        １
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        super.service(request, response);
        System.out.println("service method ...");
//        3
    }

    @Override
    public void destroy(){
        super.destroy();
        System.out.println("destroy method...");
//        server 重開的時候才會執行，而不是網頁關掉的時候
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGET method...");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>This is TryServlet</p>");
        out.println("</body></html>");
//  2

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
