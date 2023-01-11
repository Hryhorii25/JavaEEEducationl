package JavaEE5CDI;


import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//В даній програмі показано реалізацію патерну observer(спостерігач)  для програми з CDI реалізацією.
 // Даний патерн observer реалізований так що є один клас спостерігач і може буди делька класів слухачів
// і коли в класі спостерігач щось відбувається стається ivent подія) він розсилає своїм  класам слухачач мають
// якось повідомлення  про дану подію і слухачі можуть якось на неї  реагувати

@WebServlet("/Run")
public class CDI13BeanEvents extends HttpServlet {
    @Inject
    BookService bookService;
    @Inject
    Subscriber subscriber;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}


class Book{
    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Клас спостерігач
class BookService{
    @Inject
    Event<Book> event;
    public void addBook(Book book){
        System.out.println(book.getName()+ "book was added");
        event.fire(book);
    }
}


//клас слухач
class Subscriber{
    List<Book> list = new ArrayList<Book>();
    public void  add (@Observes Book book){
        System.out.println(book.getName()+ "added to list");
        list.add(book);
    }

}