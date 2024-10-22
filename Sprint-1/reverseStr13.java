//-------------------------------------------------------------------------------------------------------------------
/*Reversing a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to reverse a given string.
Example:
Input: string = "programming"
Output: "gnimmargorp"
Explanation: The reversed string of "programming" is "gnimmargorp". */
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class reverseStr13{

    //reverseString
    public static void reverseStr(String originalStr){
        String reversedStr="";
        for(int i=originalStr.length()-1; i>=0; i--){
            reversedStr+=originalStr.charAt(i);
        }
        System.out.println("Reversed string: " + reversedStr);
    }
    public static void main(String args[]){
        String originalStr="APPLE";
        reverseStr(originalStr);
    }
}