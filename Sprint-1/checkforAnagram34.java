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
        String str1=s1.replaceAll("\\s"," ");
        String str2=s2.replaceAll("\\s"," ");

        if(str1.length()!=str2.length()){
            return false;
        }else{
            char c1[]=str1.toLowerCase().toCharArray();
            char c2[]=str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }
    public static void main(String args[]){
        System.out.println(isAnagram("Listen","Silent"));
    }
}