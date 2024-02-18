import java.util.*;
class Person1{
    String name;
    int age;
    void printDetails(){
        System.out.print("My name is: " +name+ " and my age is " +age);
    }
}
public class OopExample1 {
    public static void main(String[] sri){
        Scanner sc = new Scanner(System.in);
        Person1 p1 = new Person1();
        p1.name  = "Sri";
        p1.age = 11;
        p1.printDetails();
    }
}
