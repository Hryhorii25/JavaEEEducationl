package JavaEE2JSP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/tempControler.jsp")
public class JSP8ExpressionLanguage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Student student = new Student("Vasa",22);
        request.setAttribute("stud",student);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("JSP8ExpressionLanguage.jsp");
        requestDispatcher.forward(request,response);
    }
}



class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


