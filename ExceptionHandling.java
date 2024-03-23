public class ExceptionHandling{
    public static void main(String[] sri){
        // try{
        //     System.out.println(10/0);
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        // System.out.println("Raaam");
        try{
            int[] ar = {10,20};
            System.out.println(10/0+" "+ar[2]);
            System.out.println(ar[0]);
            System.out.println(ar[1]);
            System.out.println(ar[2]);
        }
        // catch(IndexOutOfBoundsException | ArithmeticException a){
        //     System.out.println(a);
        // }
        finally{ //
            System.out.println("Hey,I'm last line");
        }
    }
}