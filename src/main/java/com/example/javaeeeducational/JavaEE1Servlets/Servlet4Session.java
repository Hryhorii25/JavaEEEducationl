package JavaEE1Servlets;

import MyPackage.Cart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet3SessionСесія")
public class Servlet4Session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();



        Cart cart = (Cart)session.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
            if (cart==null){
                    cart = new Cart();
                    cart.setName(name);
                    cart.setQuantity(quantity);
                    }
                   session.setAttribute("cart",cart);

            //PrintWriter pw = response.getWriter();
        getServletContext().getRequestDispatcher("/showCart3.jsp").forward(request,response);


                    }}



