class Animal{
    void eat(){
        System.out.println("This is Base class");
    }
}
class Bird extends Animal {
    void fly(){
        System.out.println("This is Bird class");
    }
}
class Parrot extends Bird{
    void speak(){
        System.out.println("This is Parrot class");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[]){
        Parrot obj  = new Parrot();
        obj.eat();
        obj.fly();
        obj.speak();
        System.out.println("This is about Multi-level inhertance");
    }
}
