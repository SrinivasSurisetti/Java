interface Interface_Operation{

    int factorial(int n); //Public abstract int factorial
}
class Math1 implements Interface_Operation{
    public int factorial(int n){
        int f = 1;
        for(int i=2;i<=n;i++) f*=i;
        return f;
    }
}
class Math2 implements Interface_Operation{
    public int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
public class Interface{
    public static  void main(String[] sri){
    Math1 obj1 = new Math1();
    System.out.println(obj1.factorial(4));
    Math2 obj2 = new Math2();
    System.out.println(obj2.factorial(5)); 
    }
}