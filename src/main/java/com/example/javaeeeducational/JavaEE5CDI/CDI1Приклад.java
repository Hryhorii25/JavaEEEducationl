package JavaEE5CDI;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//В даній програмі на прикладі показано роботу трьох технологій  Dependency Injection, Inventional of controls, Manegment Bin

@WebServlet("diExample")
public class CDI1Приклад extends HttpServlet {

    //Приклад використання технології Dependency Injection
    // дана @Inject анотація означає що створення обєкта  Student неявно тобто в коді не прописується
    //  Student student = new Studen а створення обєкта переходить на контроль контейнера

    //Перед використанням анотації @Inject в папці WEB-INF порібно створити спеціальний керуючий бін(CDI1beans.jsp)
    @Inject
    Student student;
    //Тепер можна керувати створенням даного обєкта  Технологія Inventional of controls


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }
}
//Manegment Bin
class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}