//------------------------------------------------------------------------------------------------------------------
/* Generating a Matrix with a Diagonal Pattern
Difficulty: Medium
Topics: Matrix Operations
Description: Write a program to create a matrix where elements form diagonal lines of a given pattern.
Example:
Input: size = 4
Output:

1 0 0 0  
1 1 0 0  
1 1 1 0  
1 1 1 1  */
//------------------------------------------------------------------------------------------------------------------


import java.util.*;

public class diagonalMatrix35 {
    public static void diagonalMatrix(int matrix[][]) {
        int n = matrix.length; // Rows
        int m = matrix[0].length; // Columns

        // Fill the matrix with the diagonal pattern
        for (int i = 0; i < n; i++) {  // Loop for rows
            for (int j = 0; j <= i; j++) {  // Loop for columns up to the diagonal
                matrix[i][j] = 1; // Assign 1 to the current position
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {  // Loop for rows
            for (int j = 0; j < m; j++) {  // Loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after printing a row
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Initialize the square matrix of size n x n
        int matrix[][] = new int[n][n];

        // Call the function to generate and print the matrix
        diagonalMatrix(matrix);

        sc.close();
    }
}
