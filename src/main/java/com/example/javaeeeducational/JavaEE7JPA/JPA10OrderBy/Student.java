package JavaEE7JPA.JPA10OrderBy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue//Обовязкові анотації

            int id;
    String name;
    int age;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @OrderBy("number DESC ")
    List<StudentAdress> list = new ArrayList<>();

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, List<StudentAdress> list) {
        this.name = name;
       list.add(new StudentAdress(1));
       list.add(new StudentAdress(2));
       list.add(new StudentAdress(3));
    }

void print (){
        for (StudentAdress studentAdress : list){
            System.out.println(studentAdress.number);
        }
}
}
