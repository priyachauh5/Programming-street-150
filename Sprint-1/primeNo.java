import java.util.*;
public class primeNo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m,j;
        System.out.print("Enter the Starting range of number: ");
        n=sc.nextInt();
        System.out.print("Enter the Ending range of number: ");
        m=sc.nextInt();
        System.out.print("Prime no between "+ "["+ n+","+m+"] :");
        for(int i=n; i<=m; i++){
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


           
        