//------------------------------------------------------------------------------------------------------------------
/*Finding the Number of Words in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to count the number of words in a given string.
Example:
Input: string = "Hello world"
Output: 2
Explanation: There are 2 words in the string.   */
//------------------------------------------------------------------------------------------------------------------

public class numOfWords34{
    public static void numOfWords(String word){
        if(word==null || word.trim().isEmpty()){
            System.out.println("Number of words: 0");
        }else{
            String words[]=word.trim().split("\\s+");
            System.out.println("Number of words: "+words.length);
        }
    }
    public static void main(String args[]){
        String word="Hello world";
        System.out.println("String is: "+word);
        numOfWords(word);
    }
}
