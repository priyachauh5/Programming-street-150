import java.util.*;
public class Palindromes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,s=0,c,r;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s){
            System.out.print("Palindrome number");
        }else{
            System.out.print("Not Palindrome number");
        }
    }
}