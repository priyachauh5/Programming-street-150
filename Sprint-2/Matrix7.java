//------------------------------------------------------------------------------------------------------------------
/* Generating a Matrix with Multiplication Table
Difficulty: Easy
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix where each element at position (i, j) is the product of i and j.
Example:
Input: size = 3
Output:

1 2 3  
2 4 6  
3 6 9  */
//------------------------------------------------------------------------------------------------------------------


import java.util.Scanner;

public class MultiplicationMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        // Generate the multiplication matrix
        int[][] matrix = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                matrix[i - 1][j - 1] = i * j;
            }
        }

        // Print the matrix
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
