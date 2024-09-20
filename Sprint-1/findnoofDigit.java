import java.util.*;
public class findnoofDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter the digits: ");
        int n=sc.nextInt();
        System.out.print("Total number of Digit: ");
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
}