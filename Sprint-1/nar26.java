import java.util.*;
public class nar26{
    public static void main(String args[]){
        int n,arm=0,rem,c;
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print("Narcissistic Number");
        }else{
             System.out.print("Not Narcissistic Number");
        }
    }
}