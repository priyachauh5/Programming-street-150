//------------------------------------------------------------------------------------------------------------------
/*Generating a Square Matrix of a Given Size
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.
Example:
Input: size = 3
Output:

1 2 3  
4 5 6  
7 8 9  */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class squareMatrix39{
    public static int squareMatrix(int size){
        int num=1;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=num++;
            }
        }
        return num;
    }
    //TO print square matrix
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the matrix number: ");
        int size=sc.nextInt();
        int[][] matrix= squareMatrix(size);
        printMatrix(matrix);
    }
}
