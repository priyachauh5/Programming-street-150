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


import java.util.Scanner;

public class modeOfNum45{

        // Method to generate a square matrix filled with sequential numbers
    // public static int[][] generateMatrix(int size) {
    //     int[][] matrix = new int[size][size];
    //     int num = 1;
        
    //     for (int i = 0; i < size; i++) {
    //         for (int j = 0; j < size; j++) {
    //             matrix[i][j] = num++;
    //         }
    //     }
        
    //     return matrix;
    // }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter the size of the square matrix: ");
    //     int size = scanner.nextInt();
        
    //     int[][] matrix = generateMatrix(size);
        
    //     System.out.println("Generated Square Matrix:");
    //     printMatrix(matrix);

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        
        int[][] matrix = generateMatrix(size);
        printMatrix(matrix);
        
        scanner.close();
    }

    // Method to generate the square matrix filled with sequential numbers
    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        int number = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = number++;
            }
        }

        return matrix;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
