package JavaEE7JPA.JPA10OrderBy;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


//В даній програмі показано застосування анотації @OrederBy яка може сортувати значення при додаванні або виводі даних з таблиці
public class OrederBy {
    public static void main(String[] args) {

        Student student = new Student("max");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("studentUnit");
        EntityManager entityManager  = entityManagerFactory.createEntityManager();


        entityManager.getTransaction().begin();
        entityManager.find(Student.class,1);

        entityManager.getTransaction().commit();
student.print();
        entityManager.close();
        entityManagerFactory.close();

    }
}

