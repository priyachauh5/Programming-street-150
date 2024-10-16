import java.util.*;
public class gcd10{
    public static void gcd(int a, int b){
        int g=0;
        int h=0;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
                System.out.println("Common factor of "+a+" and "+b+" is: "+i+" ");   
                g=i; //wala insert hoga when for loop completed
            }
        }
        System.out.println("Greatest common divisor(GCD) is: "+g);
    }
    public static void lcd(int a, int b){
        int g=0;
        int h=0;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){ 
                g=i; //wala insert hoga when for loop completed
                for(int j=g; j>=0; j--){
                    h=i;
                }
                System.out.println("Least common divisor(LCD) is: "+h);
                break;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        gcd(a,b);
        lcd(a,b);
    }
}