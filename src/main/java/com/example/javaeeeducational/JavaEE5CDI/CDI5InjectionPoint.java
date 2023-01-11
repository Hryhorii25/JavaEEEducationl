package JavaEE5CDI;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Інколи у великих програмах при викорстанні інжектів (Inject) потрібно знайти місце де саме відбувся інжект
//Дана програма призначена для визначення того де відбувся Inject логера
@WebServlet("diExample3")
public class CDI5InjectionPoint extends HttpServlet {

    @Inject
            MyLogger loggerl;

   // MyLogger logger = MyLogger.getLogger(CDI5InjectionPoint.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // logger.log(Level.ALL,"message");
    }
}

class MyLogger{

    @Produces
    public Logger getLogger (InjectionPoint injectionPoint){
        return  Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }


}