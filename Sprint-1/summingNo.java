import java.util.*;
public class starPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Summ of digits is: " + sum);
    }
}