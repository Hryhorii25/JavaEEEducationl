package JavaEE1Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


//В даній програмі розглядається  сесія. Це обєкт на сервері який зберігає інформацію про клієнта.В загальному це механізм який дає можливість
// видавати серверу інформацію індивідуально під кожного клієнта який звертається на сервер.
//В даній програмі реалізовано делька прикладів сесії і як вона будується
@WebServlet(name = "Servlet3SessionСесія")
public class Servlet3SessionСесія extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            ///Приклад використання сесії в якому обраховується скільки раз користувач заходив на сторінку

            HttpSession session = request.getSession();//Отриманна обєкта сесія для користувача даний обєкт має методи для реалізації різних задач сесії

            Integer count = (Integer) session.getAttribute("count");// Змінна яка рахує кількість входів

            if (count == null) {
                session.setAttribute("count", 1);
                count = 1;
            } else {
                session.setAttribute("count", count + 1);
            }


            PrintWriter pw = response.getWriter();

            pw.println("<html>");
            pw.println("<hl>Your count is:" + count + "</h1>");
            pw.println("</html>");


        }}
///////

