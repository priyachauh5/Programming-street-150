//-------------------------------------------------------------------------------------------------------------------
/* Finding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120. */
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class factorial8{
    public static void factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.print("Factorial of "+n+" is: "+f);
    }
    public static void main(String args[]){
        factorial(3);
    }
}