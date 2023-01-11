package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet5SetCookies1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("some_id","123");//Створення кука
        Cookie cookie2 = new Cookie("some_name","Tom");//Створення кука

        cookie1.setMaxAge(24*60*60);//Задається час який кук буде знаходитися на браузері у клієнта навіть якщо клієнт закриє браузер
        cookie2.setMaxAge(24*60*60);

        response.addCookie(cookie1);//Метод який добавляє куки на браузер клієнта
        response.addCookie(cookie2);
    }
}
