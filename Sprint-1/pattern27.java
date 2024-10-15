import java.util.*;
public class pattern27{
    public static void numPattern(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n=sc.nextInt();
        numPattern(n);
    }
}