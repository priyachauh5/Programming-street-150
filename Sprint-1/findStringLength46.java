//------------------------------------------------------------------------------------------------------------------
/*Determining the Length of a String Without Using Built-In Functions
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to determine the length of a string without using built-in functions.
Example:
Input: string = "hello"
Output: 5
Explanation: The length of the string "hello" is determined without using built-in functions.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class findStringLength46{
    public static int getLength(String str) {
        int count = 0;
        
        // Loop through each character until we reach the end
        for (char c : str.toCharArray()) {
            count++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        String input = "hello";  // Example input
        int length = getLength(input);
        
        System.out.println("Length of the string \"" + input + "\" is: " + length);
    }
}