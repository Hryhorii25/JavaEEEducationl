package JavaEE5CDI;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@Produces дана анотація дозволяє інжектати примітивні типи
public class CDI4ProducersСценарії extends HttpServlet {
    @Inject
    String s;
@Inject
    int i;
@Inject
double d;

//Інжект обєкта car через продюсер
@Inject
Car car;

//Сервлет отримує доступ до даних полів
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().write(s+ " " + i + " "+d);
    }
}


class Producer{
@Produces
    String s = "hello world";
@Produces
    int i = 5;
@Produces
    double getDouble(){
        return 2+3;
    }


    //продюсер створення обєкта іншого класу
    @Produces
    Car getCar(){
    return new Car("машина");
    }
}




class Car{
    String name;

    public Car(String name) {
        this.name = name;
    }
}

