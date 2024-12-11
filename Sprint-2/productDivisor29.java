//-------------------------------------------------------------------------------------------------------------------------
/*Finding All Divisors of the Product of Two Numbers
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find all divisors of the product of two given numbers.
Example:
Input: number1 = 6, number2 = 10
Output: [1, 2, 3, 5, 6, 10, 15, 30]
Explanation: The product of 6 and 10 is 60, and its divisors are listed.*/
//--------------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class productDivisor{
    public static List<Integer> twoNumProduct(int num1, int num2){
        List<Integer> divisors = new ArrayList<>();
        int product =num1*num2;
        for(int i=1; i<product+1; i++){
            if(product%i==0){
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static void main(String args[]){
        int num1=6;
        int num2=10;
        System.out.print(twoNumProduct(num1, num2));
    }
}