package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myContext")
public class Servlet11ContextВвід {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        //Контекст представляє собою певний універсальний спосіб обміну інформацією між сервлетами де контекст предтавляє собою певний
        // обєкт в який запиується інформація

        // Створення і введення даних в контекст
        javax.servlet.ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("one","two");

        servletContext.getContext("/URL");


    }
}

