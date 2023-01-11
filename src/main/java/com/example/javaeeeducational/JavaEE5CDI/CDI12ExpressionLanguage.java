package JavaEE5CDI;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CDI12ExpressionLanguage extends HttpServlet {
    @Inject
    MyBeans myBeans;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/CDI12TestBean.jsp");
        dispatcher.forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}


@Named //Анотація яка дозволяє працювати витягувати інформацію з даного класу через jsp
class MyBeans{
    private String s = "hello world";
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }


}