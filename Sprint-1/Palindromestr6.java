import java.util.*;
public class Palindromestr6{
    //String reverse
    public static void palindrome(String str){
        String rev=" ";
        for(int i=str.length()-1; i>=0; i++){
            rev=rev+str.charAt(i);
        }
        System.out.print("String reverse is: "+rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String[] str=new String[10];
        str=sc.nextLine();
        System.out.println();
        // palindrome(str);
    }
    //For number
    // public static void palindrome(int n){
    //     int m=n;
    //     int rev=0;
    //     while(m>0){
    //         int lastDigit=m%10;
    //         rev=lastDigit+(rev*10);
    //         m=m/10;
    //     }
    //     System.out.println("Reverse of factorial is: "+rev);
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the number: ");
    //     int n=sc.nextInt();
    //     palindrome(n);
    // }
}