import java.util.*;
public class leapYear3{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0 && n%100!=0 || n%100==0 && n%400==0){
            System.out.println("Number is leap year");
        }else{
            System.out.println("Number is not leap year");
        }
    }
}