import java.util.*;
public class Palindromes{
    public static void palindrome(int n){
        int m=n;
        int rev=0;
        while(m>0){
            int lastDigit=m%10;
            rev=lastDigit+(rev*10);
            m=m/10;
        }
        System.out.println("Reverse of factorial is: "+rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        palindrome(n);
    }
}