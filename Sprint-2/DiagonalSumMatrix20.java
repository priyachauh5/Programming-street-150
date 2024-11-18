//------------------------------------------------------------------------------------------------------------------
/*Finding the Sum of Diagonal Elements in a Matrix
Difficulty: Easy
Topics: Matrix Operations
Description: Write a program to calculate the sum of the diagonal elements in a square matrix.
Example:
Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: 15
Explanation: The sum of the diagonal elements (1 + 5 + 9) is 15.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class DiagonalSumMatrix{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
             sum+=matrix[i][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=diagonalSum(matrix);
        System.out.print(sum);
    }
}