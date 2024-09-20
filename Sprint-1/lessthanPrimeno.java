import java.util.*;
public class lessthanPrimeno{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(i=1;i<=n; i++){
            for(j=2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(j+" ");
            }
        }
    }
}