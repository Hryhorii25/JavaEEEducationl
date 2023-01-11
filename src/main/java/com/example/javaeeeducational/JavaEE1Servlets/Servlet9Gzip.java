package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

//В данім блоці коду показано як зжимти html  запити і відсилати їх на сторінку браузера це необхідно тоді коли є великий обєм
// html тексту
@WebServlet(name = "Servlet9Gzip")
public class Servlet9Gzip extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getHeader("Accept-Encoding").contains("gzip"));{
            PrintWriter printWriter = new PrintWriter(new GZIPOutputStream(response.getOutputStream()));
            printWriter.write("hello world");
        }
    }
}
