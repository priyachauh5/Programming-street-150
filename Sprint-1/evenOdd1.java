//-------------------------------------------------------------------------------------------------------------------
/* Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class evenOdd1{
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.print("Number is Even");
        }else{
            System.out.print("Number is odd");
        }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int n=sc.nextInt();
       evenOdd(n);
    }
}