package JavaEE6BeanValidation;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.Date;
import java.util.Set;


//Бін валідатори BeanValidation це набір анотацій призначений для певної перевірки  є стандартні валідатори з бібліотеки java
// а також можна створювати власні валідавтори.

//Стандартні валідатори
//@NotNull

//@Pattern() в даний валідатор вписується реджекс можна задавати параметри строки

 //@Min()@Max() задає мінімальне і максимальне числове значення яке можна ввести

//@Size задає максимальну величину масива колеції строки

//Задання параметрів дати минула або майбутня
//@Past
//@Future
//



@WebServlet("/comstraints")
public class BeanValidation1Begin extends HttpServlet {
    @Inject
    Student student;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.description);


///Даний блок коду задіює валідатор у сервлеті без нього валідація працювати не буду
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        //Метод проводить валідацію усіх параметрів які були задані при написанні класу
        //якщо валідція пройшла тобто якщо усі параметри які були задані у валід анотація були дотримані
        // то обєкт validate буде порожнім
        Set<ConstraintViolation<Student>> validate = validator.validate(student);
        if (validate.size()>0)
            System.out.println("vallid eror");

        //Блок який виведе де у валвдації помилка
        for (ConstraintViolation<Student> violation:validate){
            System.out.println(violation.getMessage());
            System.out.println(violation.getInvalidValue());
        }

///



        //Метод який перевіряє тільки одну проперті
      validator.validateProperty(student,"name");





//Метод який без створення обєкта перевіряє певне значення яке може буди присвоєно
//обєкту на то чи проходить дане значення перевірку валідатора
        validator.validateValue(Student.class,"name","Anton");



    }

}
//Приклад застосування анотацій валідації
class Student {
    @NotNull
    @Pattern.List({
            @Pattern(regexp = "[A-Z][a-z]*"),
            @Pattern(regexp = "")
    })
    String name;
    @Min(18)
    int age;
    @Size(max = 200,min = 10)
    String description;
    @Past
    Date bithDate;
    @Future
    Date dathDate;
    String sername;
    @NotNull
    public String getSername() {
        return sername;
    }
    public void setSername(@NotNull @Pattern(regexp = "[A-Z]") String sername) {
        this.sername = sername;
    }
}


