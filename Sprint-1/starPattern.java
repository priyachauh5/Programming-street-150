import java.util.*;
public class starPattern{
    public static void starPattern(int n){
        int m=n;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        starPattern(n);
    }
}