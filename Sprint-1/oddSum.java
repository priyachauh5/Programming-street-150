import java.util.*;
public class oddSum{
    public static void oddSum(int n, int m){
        int sum=0;
        for(int i=n; i<=m; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("Sum of Odd number: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("Enter the starting number: ");
        n=sc.nextInt();
        System.out.print("Enter the Ending number: ");
        m=sc.nextInt();
        System.out.print("Even no between "+ "["+ n+","+m+"] :");
        oddSum(n,m);
    }
    
}