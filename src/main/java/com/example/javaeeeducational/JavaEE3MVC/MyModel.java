package JavaEE3MVC;

public class MyModel {
   public Student getStudent(){
       Student student = new Student();
       student.setName("Max");
       student.setAge(26);
       return student;
   }

}
