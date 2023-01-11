package JavaEE5CDI;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

//Qualifier це використнання анотації для викорстання інструменту CDI Inventional of controls  при використанні інтерфейсів.

//Програма працює наступним чином у програмі є інтерфей Person і два класи(manegment bin) які імплементить даний інтерфейс.
//Задача в тому що різні класи мають різну релізацію одного метода і потрібно щоб технологія CDI в кожному класі реалізовувалась по
// іншому для цього використовують @Qualifier. Коли задіювати технологію @Inject при створенні обєкта інтерфейсу
// Person person;  програма не знає обєкт з якими методами буде створюватись тому що даний інтерфейс імплементить два класи
// в яких окрема реалізація одного методу.

@WebServlet("diExample1")
public class CDI2Quantifier extends HttpServlet {

@Inject
@WorkerAnotation
Person person;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}

//Блок коду який релізує технологію Qualifier
@Qualifier
@Retention(RUNTIME)
@Target({FIELD,TYPE,METHOD})
@interface WorkerAnotation {}
///

interface Person{
    String getName();
}

@WorkerAnotation // Застосування анотації на данім класі
class Worker implements Person {

    private String name;

    @Override
    public String getName() {
        return "Worker";
    }

    public void setName(String name) {
        this.name = name;
    }
}



class Worker1 implements Person {
        private String name;
    @Override
    public String getName() {
        return "Worker1";
    }
}


