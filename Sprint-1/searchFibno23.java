import java.util.*;
public class searchFibno23{
    public static void searchFib(int n){
        int fib1=0, fib2=1;
        System.out.println("Fibonacci numbers are: ");
        for(int i=0; i<=n; i++){
            while(fib1<n){
                System.out.print(fib1+" ");
                int fib=fib1+fib2;
                fib1=fib2;
                fib2=fib;
            }
        }
        System.out.println();
    }
    public static void position(int m){
        int arr[]={0,1,1,2,3,5,8,13,21,34,55};
       for(int i=0; i<=10; i++){
            if(i==m){
            System.out.println("Fibonacci no at position "+m+" is: "+arr[i]);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Finboncci: ");
        int n=sc.nextInt();
        // System.out.print("Enter the position: ");
        // int m=sc.nextInt();
        searchFib(n);
        System.out.print("Enter the position between [1,10]: ");
        int m=sc.nextInt();
        position(m);
    }

    // public static void main(String args[]){ 
    //     int arr[]={0,1,1,2,3,5,8,13,21,34,55};
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the position between [1,10]: ");
    //     int n=sc.nextInt();
    //     for(int i=0; i<=10; i++){
    //         if(i==n){
    //         System.out.println(arr[i]);
    //         }
    //     }
    // }

}