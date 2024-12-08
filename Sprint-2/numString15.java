//------------------------------------------------------------------------------------------------------------------
/* Finding the Sum of Numbers in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to extract and sum all numbers present in a given string.
Example:
Input: string = "The numbers are 12 and 34"
Output: 46
Explanation: The sum of numbers 12 and 34 is 46.*/
//------------------------------------------------------------------------------------------------------------------

public class numString{
    public static int strSum(String s){
        int sum=0;
         // Split the string into words based on space
        String words[]=s.split(" "); //used to divide a string into an array of substrings based on the specified delimiter.
        // Loop through each word
        for(String word: words){
            try{
                sum+=Integer.parseInt(word); //used to convert a string representation of a number into its corresponding integer value. 
            }catch(NumberFormatException e){
                // Ignore non-numeric words
            }//A runtime exception that occurs when a method like Integer.parseInt(), Double.parseDouble(), etc., fails to parse a string as a number.
        }
        return sum;
    }
    public static void main(String args[]){
        String s="The number are 12 and 34";
        System.out.print(strSum(s));
    }
}