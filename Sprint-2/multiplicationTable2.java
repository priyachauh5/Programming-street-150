//------------------------------------------------------------------------------------------------------------------
/*Generating a Multiplication Table for a Range
Difficulty: Easy
Topics: Arrays, Basic Programming
Description: Write a program to generate multiplication tables for numbers within a specified range.
Example:
Input: start = 2, end = 4
Output:

2 x 1 = 2   3 x 1 = 3   4 x 1 = 4  
2 x 2 = 4   3 x 2 = 6   4 x 2 = 8  
2 x 3 = 6   3 x 3 = 9   4 x 3 = 12  
2 x 4 = 8   3 x 4 = 12  4 x 4 = 16  */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class multiplicationTable2{
    public static void generateMultiplicationTable(int start, int end, int limit){
        for(int i=1; i<=limit; i++){
            for(int j=start; j<=end; j++){
                // System.out.print("%d x %d=%d\t",j,i,j*i);
                 //\t is a tab character.
                //The first %d is for the current number in the range (num).
                //The second %d is for the multiplier (e.g., 1, 2, 3...).
                //The third %d is for the result of the multiplication.
                System.out.printf(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end=sc.nextInt();
        int limit=10;
        generateMultiplicationTable(start,end,limit);
    }
}



