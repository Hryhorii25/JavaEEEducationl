package JavaEE6BeanValidation;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Email;
import javax.xml.validation.Validator;
import java.io.IOException;

public class BeanValidation4КастомныйВалидатор extends HttpServlet {

@Inject
    Validator validator;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}



class Person1{
    @Email
    String email;
    @CheckSiteUrl(protocol = "http")
    String siste;
    @CheckSiteUrl(host = "mysite.com")
    String siste2;
    @CheckSiteUrl(protocol = "ftp", port = 21)
    String siste3;
}

class CheEmailLogic implements ConstraintValidator<CheckSiteUrl,String>{
CheckSiteUrl checkSiteUrl;
    String protocol;
    String host;
    int port;
    @Override
    public void initialize(CheckSiteUrl constraintAnnotation) {
protocol = checkSiteUrl.protocol();
host = checkSiteUrl.host();
port = checkSiteUrl.port();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return true;
    }
}