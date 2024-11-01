//------------------------------------------------------------------------------------------------------------------
/*Checking for an Anagram
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to check if two strings are anagrams.
Example:
Input: string1 = "listen", string2 = "silent"
Output: True
Explanation: "listen" and "silent" are anagrams of each other. */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class checkforAnagram34{
    public static boolean isAnagram(String s1, String s2){
        String str1=s1.replaceAll("\\s"," "); //The replaceAll("\\s", "") method removes all whitespace from each string (s1 and s2) by replacing any space character (\\s) with an empty string "".
        String str2=s2.replaceAll("\\s"," ");

        if(str1.length()!=str2.length()){ //if length of string is not equal then
            return false;
        }else{
            char c1[]=str1.toLowerCase().toCharArray(); //convert into lower case and then into => charArray => Sort
            char c2[]=str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2); //check if character array are equal then return true otherwise false
        }
    }
    public static void main(String args[]){
        System.out.println(isAnagram("Listen","Silent")); //String passed as argument to function call
    }
}