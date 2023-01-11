package JavaEE5CDI;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Інтерсептори

@WebServlet("/InterceptorsChain")
public class CDI10InterceptorsChain  extends HttpServlet {

@Inject
InterceptorService interceptorService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       interceptorService.doJob();
    }








    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("RUN");

    }
}


//Викликаючи дану анотацію можна перед виконанням коду даного класу у сервлеті додавати код інших класів який буде виконуватись
// перед кодом даного класу
@Interceptors({InterceptorOne.class,InterceptorTwo.class})
class InterceptorService{
    public  void doJob(){
        System.out.println("do job");
    }
}





class InterceptorOne{
    @AroundInvoke
    private Object arundInvoke(InvocationContext invocationContext) throws Exception{
        System.out.println("one");
        return invocationContext.proceed();
    }
}

class InterceptorTwo{
    @AroundInvoke
    private Object arundInvoke(InvocationContext invocationContext) throws Exception{
        System.out.println("two");
        return invocationContext.proceed();
    }
}


