package JavaEE6BeanValidation;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.xml.validation.Validator;
import java.io.IOException;

import java.util.Set;

import static java.lang.annotation.ElementType.*;

public class BeanValidation3КастомныйКомпозитныйВалидатор extends HttpServlet {

    @Inject
    javax.validation.Validator validator;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<ConstraintViolation<Person>> email = validator.validateValue(Person.class,"email","mymail@gmail.com");
        for (ConstraintViolation violation:email){
            System.out.println(violation.getMessage());
            System.out.println(violation.getInvalidValue());

        }
        Set<ConstraintViolation<Person>> email1 = validator.validateValue(Person.class,"email","mymail@gmail.ru");
        for (ConstraintViolation violation:email){
            System.out.println(violation.getMessage());
            System.out.println(violation.getInvalidValue());
    }
    }
}
//Клас у якому при створенні обєкта буде задіюватись власний валідатор
class Person{
    @CheckEmail
    String email;
}


