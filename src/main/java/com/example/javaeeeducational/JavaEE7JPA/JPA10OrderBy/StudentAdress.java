package JavaEE7JPA.JPA10OrderBy;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class StudentAdress {
    @Id @GeneratedValue
    int Id;
    String street;
    String city;
    int number;

    public StudentAdress() {
    }

    public StudentAdress(int number) {
        this.number = number;
        street = "street";
        city = "city";
    }
}
