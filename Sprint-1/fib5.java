import java.util.*;
public class fib5{
    public static void fibSeries(int n){
        int fib1=0, fib2=1;
        for(int i=0; i<=n; i++){
            while(fib1<=n){
                System.out.print(fib1+" ");
                int fib=fib1+fib2;
                fib1=fib2;
                fib2=fib;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the range of number: ");
        n=sc.nextInt();
        fibSeries(n);
    }
}