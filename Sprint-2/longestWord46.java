//------------------------------------------------------------------------------------------------------------------
/*Finding the Length of the Longest Word in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to find the length of the longest word in a given string.
Example:
Input: string = "Find the longest word"
Output: 8
Explanation: The longest word is "longest" with length 8. */
//------------------------------------------------------------------------------------------------------------------

public class longestWord46{
    public static void longestWord(String word){
        int maxLength=0;
        String[] words = word.split("\\s+"); 
        if(word==null || word.trim().isEmpty()){
            System.out.println("Number of words: 0");
        }else{
            for(String s: words){
                int length=s.replaceAll("[^a-zA-Z]", "").length();
                maxLength=Math.max(maxLength, length); //Update max length
            }
            System.out.println("Longest word in the string is: "+maxLength);
        }
    }
    public static void main(String args[]){
        String word="Find the longest word";
        longestWord(word);
    }
}