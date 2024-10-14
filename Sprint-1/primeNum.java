import java.util.*;
public class primeNum{
    public static void primeNo(int n){
        int m=n;
        //corner case
        if(m==2){
            System.out.print("Number is prime");
        }
        for(int i=1; i<m; i++){
            if(m%2==0){
                System.out.println("Number is not prime");
                break;
            }else{
                System.out.println("Number is prime");
                break;
            } 
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        primeNo(n);
    }
}