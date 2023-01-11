package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/Servlet1Bebin") //У даній програмі показано приклад створення сервлета через анотацію @WebServle "/hello") при використанні такого способу не потрібно
// прописувати дані у xml файлі модуля EEServer

//https://uk.wikipedia.org/wiki/%D0%A1%D0%B5%D1%80%D0%B2%D0%BB%D0%B5%D1%82
//Java Servlet API — стандартизований API для створення динамічного контенту до веб-сервера, використовуючи платформу Java
//В папці src лежать сервлети Tomcat  являє собою сервер і контейнер  сервлетів після запуску Tomcat на компютері він запускає усі класи з папки src
// і викликає в них метод init після чого сервлет готовий до роботи і можна посилти запит до веб сервера
public class Servlet1Bebin extends HttpServlet {

   /// Метод який виконується якщо щось міняє на севері
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //Даний метод виводить якись дані або сторінку повністю тобто з сторінки ми звертаємся на якись сайт вводячи url сайту.
    // Сайт занаходтисься на сервері сервер отримавши даний запит відправляє назад код який прорисовує викликану нами сторінку
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        //Тут реалізовано найпростішу програму на JavaEE яка виводить надпис на html сторінці.В програмі відбуваються наступні дії заходячи на localhost Servlet1
        // с ервлет передає інфрмацію на  сторінку і прорисовує те що в севлеті порописаног
//Код який передає для прорисовки на html сторінці тексту
        printWriter.println("<html>");

        printWriter.println("<h1>Hello</h1>");
        printWriter.println("</html>");
    /////
    }
}
