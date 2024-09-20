import java.util.*;
public class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        int g=0;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
            
        }
        System.out.println("GCD= "+g);
    }
}