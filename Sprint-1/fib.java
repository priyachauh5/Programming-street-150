import java.util.*;
public class fib{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}