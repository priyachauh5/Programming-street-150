import java.util.*;
public class primeNum{
    public static void main(String args[]){
        int n, count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}