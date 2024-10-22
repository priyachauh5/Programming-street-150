//-------------------------------------------------------------------------------------------------------------------
/* Identifying Palindromes
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to check if a string or number is a palindrome.
Example:
Input: string = "radar"
Output: Palindrome
Explanation: "radar" reads the same backward as forward.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class Palindromestr6{
    //String reverse
    public static void palindrome(String str){
        String rev="";
        String str_p=str;
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i); //used to accessed the character
        }
        System.out.print("String reverse is: "+rev);
        System.out.println();
        if(str_p.equals(rev)){
            System.out.print(str+" is palindrome");
        }else{
            System.out.print(str+" is not palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        palindrome(str);
    }
}