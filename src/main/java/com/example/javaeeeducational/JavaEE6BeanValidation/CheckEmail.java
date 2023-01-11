package JavaEE6BeanValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;


//Приклад створення власного валідатора використовуючи анотації  в BeanValidation3КастомныйКомпозитныйВалидатор
@NotNull
@Size(min =7)
@Pattern(regexp = "")
@Constraint(validatedBy = {})
@Target({METHOD,FIELD,ANNOTATION_TYPE,CONSTRUCTOR,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
 public  @interface CheckEmail{
 String messege() default "Email address doesnt look goot";
 Class<?>[] groups() default {};
 Class<? extends Payload>[]payload()default{};

}
