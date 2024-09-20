import java.util.*;
public class perfectNo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.print("Perfect Number");
        }else{
            System.out.print("Not Perfect number");
        }
    }
}