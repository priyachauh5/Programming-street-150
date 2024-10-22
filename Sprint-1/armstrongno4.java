//-------------------------------------------------------------------------------------------------------------------
/*Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class armstrongno4{
    public static void arm(int n){
        int m=n;
        int arm=0;
        while(n>0){
            int rem=n%10;
            arm= (rem*rem*rem)+arm;   //remainder to get the last digit
            n=n/10; //15
        }
        if(m==arm){
            System.out.println("Number is armstrong number");
        }else{
            System.out.println("Number is not armstrong number");
        }
    }
    public static void main(String args[]){
        int n;
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arm(n);
        // c=n;
        // while(n>0){
        //     rem=n%10;
        //     arm=(rem*rem*rem)+arm;
        //     n=n/10;
        // }
        // if(c==arm){
        //     System.out.print("Armstrong Number");
        // }else{
        //     System.out.print("Not Armstrong Number");
        // }
    }
}