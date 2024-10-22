//-------------------------------------------------------------------------------------------------------------------
/* Generating Multiplication Tables
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to generate multiplication tables for a given number.
Example:
Input: number = 4
Output:

4 x 1 = 4  
4 x 2 = 8  
4 x 3 = 12  
4 x 4 = 16  
4 x 5 = 20 
Explanation: The multiplication table for 4 up to 5 is generated. */
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class mutipliTable18{
    public static void multiple(int n){
        for(int i=0; i<=10; i++){
            int mult=n*i;
            System.out.println(n+"x"+i+"="+mult);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the Table number: ");
        n=sc.nextInt();
        multiple(n);
    }
}