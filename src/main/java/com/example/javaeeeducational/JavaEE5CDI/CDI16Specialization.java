package JavaEE5CDI;

import javax.enterprise.inject.Specializes;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//В даній програмі показано приклад роботи анотації @Specializes дана анотація використовується якщо іде
// інжект якогось обєкта інтерфейсу і потрібно визначити метод якого класу реалізовувати  якщо є
// ієрархія декількох класів

@WebServlet("/spec")
public class CDI16Specialization extends HttpServlet {
    @Inject
    A1 a1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        a1.print();
    }
}

interface A1 {
    public void print();


}

class B1 implements A1 {
    public void print() {
        System.out.println("b");
    }
}

@Specializes
class C extends B1 {
    @Override
    public void print() {
        System.out.println("c");
    }
}