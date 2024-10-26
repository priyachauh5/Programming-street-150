//------------------------------------------------------------------------------------------------------------------
/*Checking for Perfect Squares
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to determine if a number is a perfect square.
Example:
Input: number = 16
Output: True
Explanation: 16 is a perfect square (4^2 = 16).*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class PerfectSquare37{
    public static boolean perfectSq(int n){
        if(n<0){
            return false;
        }
        int nums=(int)Math.sqrt(n);
        return(nums*nums==n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean result=perfectSq(n);
        System.out.println("Is "+n+" a perfect Square? "+result);
    }
}