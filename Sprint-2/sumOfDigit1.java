//------------------------------------------------------------------------------------------------------------------
/*Finding the Sum of Digits of a Number Until Zero
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to repeatedly sum the digits of a number until the result is zero.
Example:
Input: number = 123
Output: 6
Explanation: Sum of digits is 1 + 2 + 3 = 6; sum of digits of 6 is 6 (which is a single digit).*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class sumOfDigit1{
    public static void sumOfDigit(int n){
        int num=n;
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        System.out.print("Sum of "+n+" is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sumOfDigit(n);
    }
}