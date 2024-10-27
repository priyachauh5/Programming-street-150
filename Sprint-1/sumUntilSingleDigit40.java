//------------------------------------------------------------------------------------------------------------------
/*Calculating the Sum of Digits of a Number Until Single Digit
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to keep summing the digits of a number until a single digit is obtained.
Example:
Input: number = 9875
Output: 2
Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.*/
//------------------------------------------------------------------------------------------------------------------


import java.util.*;
public class sumUntilSingleDigit40{
     //function will call till sum is greater or equal to 10
    public static int getSingleDigitSum(int n){
        while(n>=10){ //continue until num is a single digit
            n=sumOfDigit(n);
        }
        return n;
    }

    public static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10; //123=3
            sum=sum+lastDigit; //0+3
            n=n/10; //12
        }
        return sum;
    }
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Digit: ");
        int n=sc.nextInt();
        int result=getSingleDigitSum(n);
        System.out.println("Sum of "+n+" is: "+sumOfDigit(n));
        System.out.print("Sum until single digit is: "+result);
    }
}