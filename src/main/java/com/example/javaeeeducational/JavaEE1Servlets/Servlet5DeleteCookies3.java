package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet5DeleteCookies3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Блок коду який видаляє кук через перезапити кука і задання часу існування
        Cookie cookie = new Cookie("some_id","");
        cookie.setMaxAge(0);

        response.addCookie(cookie);
    }
}
