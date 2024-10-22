//-------------------------------------------------------------------------------------------------------------------
/* Checking if a Number is a Narcissistic Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).
Example:
Input: number = 153
Output: Narcissistic Number
Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class nar26{
    public static void narcissistic(int n){
        int arm=0,rem,c;
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print("Narcissistic Number"); //It is armstrong number;
        }else{
             System.out.print("Not Narcissistic Number");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        narcissistic(n);
    }
}