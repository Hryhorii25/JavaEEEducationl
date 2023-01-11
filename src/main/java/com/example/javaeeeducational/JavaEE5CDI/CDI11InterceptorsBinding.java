package JavaEE5CDI;

import javax.inject.Inject;
import javax.interceptor.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Interceptors Binding це інструмент аналогічний до InterceptorsChain  для  додавання логіки коду інших класів або методів

public class CDI11InterceptorsBinding  extends HttpServlet {

    @Inject
    InterceptorService2 interceptorService2;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        interceptorService2.doJob();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("RUN");

    }
}


//Викликаючи дану анотацію можна переед виконанням коду даного класу у сервлеті додавати код інших класів який буде виконуватись
// перед кодом даного класу
@One
@Interceptor
class InterceptorService2{
    public  void doJob(){
        System.out.println("do job");
    }
}

//Блок коду для створення потрібної анотації @One
@InterceptorBinding
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface One{}



@One //Анотація маркер для Інтерсептор класу
class InterceptorOne2{
    @AroundInvoke
    private Object arundInvoke(InvocationContext invocationContext) throws Exception{
        System.out.println("one");
        return invocationContext.proceed();
    }
}

