import java.util.*;
public class reverseStr{
    public static void reverseStr(int n){
        int m=n;
        int rev=0;
        while(m>0){
            int lastDigit=m%10;
            rev=lastDigit+(rev*10);
            m=m/10;
        }
        System.out.print("Reverse of the String is: "+rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        int n=sc.nextInt();
        reverseStr(n);
    }
    
}