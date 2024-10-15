import java.util.*;
public class factorial8{
    public static void factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.print("Factorial of "+n+" is: "+f);
    }
    public static void main(String args[]){
        factorial(3);
    }
}