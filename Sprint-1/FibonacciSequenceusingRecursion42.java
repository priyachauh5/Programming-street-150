//------------------------------------------------------------------------------------------------------------------
/*Generating a Fibonacci Sequence Using Recursion
Difficulty: Medium
Topics: Recursion, Sequences
Description: Write a recursive program to generate the Fibonacci sequence up to a given number.
Example:
Input: number = 5
Output: 0, 1, 1, 2, 3
Explanation: The Fibonacci sequence up to 5 is generated.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class FibonacciSequenceusingRecursion42{
     // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        int n = 5;  // Example input to generate the first 5 Fibonacci numbers
        System.out.print("Fibonacci sequence up to " + n + ": ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + (i < n - 1 ? ", " : ""));
        }
    }
}
