import java.util.*;
public class findarmStrongno{
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=sc.nextInt();
        System.out.println("Is Armstrong number: "+ isArmstrong(number));
    }
    Static boolean isArmstrong(int n){
        int digits=0,temp;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        System.out.println("Number og digits: "+digits);
        temp=n;
        while(temp>0){
            int lastDigit=temp%10;
            sum=(int)(sum+ Math.pow(lastDigit, digits));
            temp=temp/10;
        }
        System.out.println("sum is: "+sum);
        if(sum==n){
            return true;
        }
        return false;
    }
}