import java.util.*;
public class LCM11{
    public static void lcm(int a, int b){
        int g=0;
        for(int i=1; i<=a; i++){  //factor satring from 1
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        int lcm=(a*b)/g;
        System.out.println("LCM= "+lcm);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        lcm(a,b);
    }
    
}