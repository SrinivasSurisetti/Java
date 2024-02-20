public class Method_Overloading_2 {
    static void max(int a,int b){
        System.out.println(a>b ? a:b);
    }
    static void max(int a,int b,int c){
        if(a>b && a>c) System.out.println(a);
        else if(b>a && b>c) System.out.println(b);
        else System.out.println(c);
    } 
    static void max(int[] arr,int n){
        int mx =0 ;
        for(int i=0;i<n;i++){
            if (arr[i]>mx) mx=arr[i];
        }
        System.out.println(mx);
    }
    public static void main(String[] sri){
        max(2,45);
        max(2,4,6);
        int[] arr = {1,2,9,8,5};
        max(arr,5);
    }
}
