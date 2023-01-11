package JavaEE2JSP;

public class TestClass {
    public static void main(String[] args) {
        A a = new A();

    }

}

class A{
    String name;
     int age;
public A(){};
    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void somMetod(){
        System.out.println("somMetod");
    }}