package JavaEE6BeanValidation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
@Constraint(validatedBy = {})
@Target({METHOD,FIELD,ANNOTATION_TYPE,CONSTRUCTOR,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)

public @interface CheckSiteUrl {
    String message() default "wrong url";
    Class <? extends Payload>[] psyload() default {};
    int port() default  - 1;
    String host()  default "";
    String protocol() default "";
}
