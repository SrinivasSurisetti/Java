interface MyWaterBottelInterface{
    String color = "Black";
    void fillup();
    void pourup();
}
class MyWaterBottel implements MyWaterBottelInterface{
    public void fillup(){
        System.out.println("Water Bottle is filled up");
    }
    public void pourup(){
        System.out.println("Water is being poured up");
    }
}
public class InterfaceTask {
    public static void main(String sri[]){
        MyWaterBottel obj = new MyWaterBottel();
        obj.fillup();
        obj.pourup();
        System.out.println("My Bottle colour is "+ MyWaterBottel.color);
    }    
}
