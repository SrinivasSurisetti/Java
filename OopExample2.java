// import java.util.*;
class Person2 {
    //member variables / attributes
    String name; //non static /instance membr
    int age; //non static /instance membr
}
public class OopExample2{
    public static void main(String[] sri){
        Person2 p1 = new Person2();
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}