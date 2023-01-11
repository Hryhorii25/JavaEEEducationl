package JavaEE4WebXML;

import javax.servlet.*;
import java.io.IOException;


//В даному прикладі показано програмну реалізацію фільтра
public class WebXml8Filter implements javax.servlet.Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");

    }



//В данім методі прописується основна логіка фільтра
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
filterChain.doFilter(servletRequest,servletResponse);

    }



    @Override
    public void destroy() {
        System.out.println("destroy servlet");

    }
}
