//------------------------------------------------------------------------------------------------------------------
/*Generating a Diamond Pattern of Stars
Difficulty: Medium
Topics: Patterns, Basic Programming
Description: Write a program to create a diamond pattern with stars of a given size.
Example:
Input: size = 5
Output:

  *  
 ***  
*****  
 ***  
  *  */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class diamondPattern5{

    public static void printDiamond(int size) {
        // Upper part of the diamond
        for (int i = 1; i <= size-2; i++) {
            // Print leading spaces
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = size - 3; i >= 1; i--) {
            // Print leading spaces
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the diamond pattern: ");
        int size = scanner.nextInt();
        printDiamond(size);
    }
}
