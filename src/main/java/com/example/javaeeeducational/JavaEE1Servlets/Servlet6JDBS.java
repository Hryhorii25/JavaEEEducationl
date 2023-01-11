package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Servlet6JDBS extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        try {
            Class.forName("org.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","qwerty");

            Statement statement = connection.createStatement();
            ResultSet rs =statement.executeQuery("SELECT from books_db");

            while (rs.next()){

printWriter.println(rs.getString("book_nfme"));
            }
statement.close();

        } catch (SQLException e) {
            e.printStackTrace();


        }


    }
}










// printWriter.println("<html>");
////
////        printWriter.println("<h1>Hello</h1>");
////        printWriter.println("</html>");