import java.util.*;
class Circle{
    double radius;
    static final double pi = 3.14;
    void printDiameter(){
        System.out.println(2*radius);
    }
    void printArea(){
        System.out.println(pi*radius*radius);
    }
    void printPerimeter(){
        System.out.println(2*pi*radius);
    }
}
public class TaskOnCircle {
    public static void main(String[] sri){
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.radius = sc.nextInt();
        c1.printDiameter();
        c1.printArea();
        c1.printPerimeter();
    }
        
}