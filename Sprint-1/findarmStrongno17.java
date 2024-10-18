import java.util.*;
public class findarmStrongno17{
    public static boolean armstrongRange(int num){
        int originalNum=num;
        int arm=0;
        int digits=Integer.toString(num).length(); //converting the integer to a string and then finding its length to determine how many digits the number has.
        int rem=0;
        while(num>0){
            rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10; //num/=10;
            // System.out.print(arm);
        }
        return arm==originalNum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int n=sc.nextInt();
        System.out.print("Enter the ending range: ");
        int m=sc.nextInt();
        // armstrongRange(n,m);
        System.out.println("List of armstrong number present from"+n+"to"+m+"are: ");
        for(int i=n; i<=m; i++){
            if(armstrongRange(i)){
                System.out.println(i);
            }
        }
    }
}