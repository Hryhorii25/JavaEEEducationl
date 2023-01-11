package JavaEE5CDI;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//В даній програмі показано як застосовувати анотацію @Alternative яка скорочує код. При застосуванні даної анотації в beans
//  файлі даного сервлета обовязково вказувати необхідний тег
public class CDI3Alternatives extends HttpServlet {
    @Inject
    Person2 person2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println();
    }
}

interface Person2{String getName();}




@Alternative //Дана анотація показує методи якого класу оверайдити на Person2 person2;
class Worker2 implements Person2 {
    public String getName(){
        return "worker";
    }

}

class Worker3 implements Person2 {
    public String getName(){
        return "student";
    }
}