import java.util.*;
public class perfectNo20{
    public static void perfect(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum is: "+sum);
        if(sum==n){
            System.out.print("Perfect NUmber");
        }else{
            System.out.print("NOt perfect number");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        perfect(n);
    }
}