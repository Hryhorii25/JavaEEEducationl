package JavaEE1Servlets;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Створення асинхронного сервлета. Асинхронні сервлети використовуються в тому випадку коли є сервлет в якому є
// ймовірність зациклення через очікування якоїсь події або через очікування до доступу до якогось ресурсу і уся
// веб сторінка в цьому випадку висить. Використовуючи в таких випадках асинхронні сервлети коли відбувається таке
// зависання програма передає роботу іншому потоку


@WebServlet(value = "/JavaEE1Servlets.Servlets14АсинхронніСервлети", asyncSupported = true)
public class Servlets10АсинхронніСервлети extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext = req.getAsyncContext();
        asyncContext.start(new Runnable() {
            @Override
            public void run() {

            }
        });
    asyncContext.complete();
    }
}
