import java.util.*;
public class evenOdd1{
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.print("Number is Even");
        }else{
            System.out.print("Number is odd");
        }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int n=sc.nextInt();
       evenOdd(n);
    }
}