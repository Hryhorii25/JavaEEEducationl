package JavaEE4WebXML;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/filterservle")//Використовуючи дану анотацію фільтр можна записувати не викорстовючи окремий Webxml файл
public class WebXml8ФільтрАнотація implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");

    }




    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }



    @Override
    public void destroy() {
        System.out.println("destroy servlet");

    }
}
