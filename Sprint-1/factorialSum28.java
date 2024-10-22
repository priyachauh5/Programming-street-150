//-------------------------------------------------------------------------------------------------------------------
/* Finding the Sum of the Digits of the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the digits of the factorial of a given number.
Example:
Input: number = 4
Output: 9
Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class factorialSum28{
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.println("Factorail of "+n+" is: "+f);
        int num=f;
        int rev=0;
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            rev=lastDigit+(rev*10);
            num=num/10;
            sum=sum+lastDigit;
        }
        System.out.println("Reverse of factorial is: "+rev);
        System.out.print("Sum of factorial is: "+sum);
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int n=sc.nextInt();
        factorial(n);
    }
}

//calculated factorial
//reversed
//sum