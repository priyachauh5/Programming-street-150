//-------------------------------------------------------------------------------------------------------------------
/* Finding the Count of Specific Digits in a Number
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count the occurrences of a specific digit in a number.
Example:
Input: number = 122333, digit = 3
Output: 3
Explanation: The digit 3 occurs 3 times in the number 122333.*/
//-------------------------------------------------------------------------------------------------------------------


import java.util.*;
public class countSpecifiDigit41{
    public static int countDigit(int num, int speDigit){
        String numStr = String.valueOf(num); // Convert number to string
        char targetChar = Character.forDigit(speDigit, 10); // Convert digit to char

        int count = 0;
        for (char c : numStr.toCharArray()) { // Loop through each character in the string
            if (c == targetChar) {
                count++; // Increment count if character matches target
            }
        }
        
        return count;
    }
    public static void main(String args[]){
        int num=122333;
        int speDigit=3;
        //count occurrance of specific digit
        int count=countDigit(num,speDigit);
        System.out.println("The digit "+speDigit+" appears "+count+" times in "+num);
    }
}