import java.util.*;
public class nar26{
    public static void narcissistic(int n){
        int arm=0,rem,c;
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print("Narcissistic Number"); //It is armstrong number;
        }else{
             System.out.print("Not Narcissistic Number");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        narcissistic(n);
    }
}