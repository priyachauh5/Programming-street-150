//------------------------------------------------------------------------------------------------------------------
/*Calculating the Power of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the power of a number.
Example:
Input: base = 2, exponent = 3
Output: 8
Explanation: 2 raised to the power of 3 is 8.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class numPow{
    public static void numPow(int base){
        int m=1, value=0;
        while(base>0){
            value=m*(int)Math.pow(base,base+1);
            System.out.print("Power of number is: "+value);
            break;
        }
    }
    public static void main(String args[]){
        int base=2;
        numPow(base);
    }
}