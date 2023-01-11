package JavaEE7JPA;


import JavaEE3MVC.Student;

import javax.persistence.*;
import java.util.Date;
//В програмі показано приклад застосування анотації @Entity для створення спеціального класу який буде являти собою таблицю в БД
public class JPA2Entities {
    public static void main(String[] args) {

        /////Блок коду для створення обєкта таблиці в БД і поміщення у таблицю одного елемента через обєкт класу
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
        EntityManager em  = emf.createEntityManager();

        Students students = new Students();
        students.name= "Max";
        students.age =28;
        students.bith = new Date();


        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(students);
        tx.commit();
        em.close();
        emf.close();
        ////
    }

}


//@Entity дана анотація застосовується в класі для створення таблиці в базі даних поля класу будуть
// відповідати полям таблиці. Даний клас повинен від повідати деяким критеріям.
@Entity
class Students{
    @Id @GeneratedValue//Обовязкові анотації
    int id;
    String name;
    int age;
    Date bith;
}
