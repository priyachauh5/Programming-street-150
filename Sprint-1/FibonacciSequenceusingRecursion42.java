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
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci((n - 1)+(n-2));
    }
    public static void main(String args[]){
        int number = 5;  // You can change this value to generate more terms
        System.out.println("Fibonacci sequence up to " + number + " terms:");

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + (i < number - 1 ? ", " : ""));
        }
    }
}