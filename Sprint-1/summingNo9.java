import java.util.*;
public class summingNo9{
    public static void sumofNo(int n){
        int sum=0;
        int m=n;
        while(m>0){
            int lastDigit=m%10;
            sum=sum+lastDigit;
            m=m/10; //to find remaining;
        }
        System.out.print("Sum of digit is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sumofNo(n);
    }
}