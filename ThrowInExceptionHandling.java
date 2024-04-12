import java.lang.reflect.Method;
class Example {
    public static void printArray(String[] arr){
        for(String s : arr){
            System.out.println(s+" ");
        }
    }
    public static void printArray(Integer[] arr1){
        for(Integer s : arr1){
            System.out.println(s+" ");
        }
    }    
    public static void printArray(Double[] arr2){
        for(Double s : arr2){
            System.out.println(s+" ");
        }
    }
}
public class ThrowInExceptionHandling{
    public static void main(String[] sri){
        String[] arr  = {"abc","pqr","xyz"};
        Integer[] arr1 = {10,20,30,40};
        Double[] arr2 = {1.2,2.2,3.2,4.2};
        Example.printArray(arr);
        Example.printArray(arr1);
        Example.printArray(arr2);
        Method[] methods = Example.class.getDeclaredMethods(); 
        // Method[] methods  = ArrayList.class.getDeclareMethods();//This is not only for user defined classses
        int cnt = 0;
        for(Method m:methods){
            if (m.getName().equals("printArray")){
                cnt++;
            }
        }
        if(cnt>1){
            throw new RuntimeException("No OverLoading is allowed");
        }

    }
}