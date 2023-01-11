package JavaEE7JPA.JPA11JPAInServlet;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EjbBean {
    @PersistenceContext
    EntityManager entityManager;
    public  void saveStudent(Student student){
        entityManager.persist(student);
    }
}
