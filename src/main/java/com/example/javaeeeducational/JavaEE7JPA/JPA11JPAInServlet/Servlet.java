package JavaEE7JPA.JPA11JPAInServlet;




import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//В даній програмі показано як працює JPA в JAVAEE. Використовуючи сервлет записується інформація у таблицю БД
@WebServlet("/jpaServlet")
public class Servlet extends HttpServlet {
    @EJB
    EjbBean jpa11EjbBean;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
Student student = new Student();
jpa11EjbBean.saveStudent(student);
resp.getWriter().write(student.getId());
    }
}
