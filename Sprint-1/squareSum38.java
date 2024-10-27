//------------------------------------------------------------------------------------------------------------------
/*Finding the Sum of Squares of Digits
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the squares of the digits of a number.
Example:
Input: number = 123
Output: 14
Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class squareSum38{
    public static void squareSum(int num){
        int n=num;
        int digSqrSum=0;
        while(n>0){
            int lastDigit=n%10;
            digSqrSum=digSqrSum+lastDigit*lastDigit;
            n=n/10;
        }
        System.out.print("Sum of square of digit "+num+" is: "+digSqrSum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        squareSum(num);
    }
}