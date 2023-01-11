package JavaEE5CDI;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//В даному прикладі показано застосування і різницях двох скоупів. В програмі створюються два класи і кожен клас має свій скоуп
@WebServlet("/scope")
public class CDI6ScopeBeans extends HttpServlet {
    @Inject
    A a;
    @Inject
    B bean;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        a.i = 5;
        bean.changeI();
        resp.getWriter().write("i = " + a.i);
    }
}


//Список скоупів
//@ApplicationScoped
//@SessionScoped
//@RequestScoped
//@ConversationScoped
// @RequestScoped
// @Dependent //default





@Dependent //default
class A {
    int i;
}

@RequestScoped
class B {
    //int i;
    @Inject
   A a;
    void changeI() {
a.i=2;
    }
}
