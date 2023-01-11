package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//https://ru.wikipedia.org/wiki/%D0%A1%D0%B5%D1%80%D0%B2%D0%BB%D0%B5%D1%82_(Java)
//https://java-master.com/%D0%BA%D0%B0%D0%BA-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0%D0%B5%D1%82-servlet/
//Сервлет це по суті програма яка обробляє запити і динамічно генерує відповіді на них


//Схема роботи та застосування
//Клієнт (наприклад, Веб-оглядач), відвідує веб-сторінку та надсилає HTTP запит на сервер.
//Web-сервер отримує запит та передає його контейнеру сервлетів.Контейнер сервлетів може виконуватись в тому ж самому процесі,
// що і веб-сервер, в окремому процесі на тій же системі, що і веб-сервер, або взагалі в окремому процесі на іншій системі.
//Контейнер сервлетів з'ясовує який сервлет слід викликати, виходячи з інформації про конфігурацію утримуваних сервлетів,
// та викликає його, передаючи як параметри об'єктні представлення запиту та відповіді.
//Сервлет використовує об'єкт запиту для отримання інформації про віддаленого користувача, параметри HTTP запиту тощо.
// Сервлет виконує запрограмовані в ньому дії та надсилає результати роботи через об'єкт відповіді.
//Після того, як сервлет припиняє обробку запиту, контейнер сервлетів перевіряє коректність відправки відповіді,
//та повертає управління до головного веб-сервера.


@WebServlet("/LiveCycle")
public class Servlet2Докладно extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String s = "<html>"+
             "<header><title>This is title</title></header>"+
             "<bogy>"+
             "Hello word Servlet"+
             "<body>"+
             "<html>";
     resp.getWriter().write(s);
    }


    //Усі запити які приходять на сокед обробляються методом даний метод працює наступним чином вона перевіряє як запит
    // прийшав і відносного того запиту визиває у себе новий метод для обробки команди
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }
}
