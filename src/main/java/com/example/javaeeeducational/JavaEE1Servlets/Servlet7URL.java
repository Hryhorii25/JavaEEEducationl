package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

//В даній програмі детально розбираються методи взаємодії між сокетом(програмою в java) і html сторінкою та обмін даними між ними
@WebServlet("/servlet")
public class Servlet7URL extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //req являє собою обєкт який приймає дані з html сторінки


        /////Блок коду який забезпечує передачу і прийом інформації з html сторінки у сервлет


        //http://localhost:8080//servlet?one=alba за допогою такого ввода можна задати параметри  з html сторінці
        String one=req.getParameter("one");//
        System.out.println(one);

        //Блок коду для прийому масиву значень і виведення
        String[]ones = req.getParameterValues("one");
        for (String s : ones){
            System.out.println(s);
        }
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String elementName = parameterNames.nextElement();
            System.out.println(elementName + " = " + req.getParameter(elementName));
        }

        Map<String,String[]> parameterMap = req.getParameterMap();//робота з даними через мапу

        System.out.println(req.getRequestURI());//URL звідки прийшов запит
        System.out.println(req.getServletPath());
        System.out.println(req.getRemoteHost());//IP адрес
        System.out.println(req.getLocalPort());// порт
        System.out.println(req.getQueryString());// самі запити

///

        ///Блок коду передачі даних із сервлета на html сторінку
        resp.getWriter().write("<</head>\n" +
                "<body>\n" +
                "\n" +
                "<h4> JAVA </h4>\n" +
                "<p> DADA </p>\n" +
                "\n" +
                "<! Третій спосіб задання стиля являє собою щапис CSS коду у HTML  тег в цім блоці стиль задається тільки елементам які даного тегу >\n" +
                "<h3><a style=\"color: blue\">ANDROID </a> </h3>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>>");

    }

    ///Метод прийому запитів з post запитів
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet (req,resp);
    }

    ///




}