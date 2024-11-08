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
    public static void multiplicationTable(int n, int m){
        int result=0;
        int i,j;
        for(i=n; i<m; i++){
            for(j=i; i<4; j++){
                result=i*j;
            }
        }
        System.out.print(i+"x"+i+"="+result);
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int n=sc.nextInt();
        System.out.print("Enter the ending range: ");
        int m=sc.nextInt();
         multiplicationTable(n,m);
    }
}
