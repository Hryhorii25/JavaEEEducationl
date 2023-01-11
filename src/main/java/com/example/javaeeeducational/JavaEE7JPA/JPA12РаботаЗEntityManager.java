package JavaEE7JPA;

import JavaEE7JPA.JPA10OrderBy.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;


//@ Основні операції з EntityManager
public class JPA12РаботаЗEntityManager {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("book");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(new Student());
        entityManager.getTransaction().commit();


        //
       entityManager.find(Student.class,1);//Метод пошуку по таблиці

        entityManager.getReference(Student.class,1);//Інший метод пошуку

        entityManager.flush();//Запис в базу даних

        entityManager.remove(""); //Видалення обєкта
//
        entityManager.close();
        entityManagerFactory.close();
    }
}
