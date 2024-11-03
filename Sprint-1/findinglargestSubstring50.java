//------------------------------------------------------------------------------------------------------------------
/*Finding the Longest Substring Without Repeating Characters
Difficulty: Medium
Topics: String Manipulation, Sliding Window
Description: Write a program to find the longest substring without repeating characters in a given string.
Example:
Input: string = "abcabcbb"
Output: "abc"
Explanation: The longest substring without repeating characters is "abc".*/
//------------------------------------------------------------------------------------------------------------------


import java.util.HashSet;

public class findinglargestSubstring50{

    public static String findLongestSubstringWithoutRepeatingCharacters(String str) {
        int left = 0, right = 0;
        int maxLength = 0;
        int startIndex = 0; // Start index of the longest substring found
        HashSet<Character> charSet = new HashSet<>();
        
        while (right < str.length()) {
            char currentChar = str.charAt(right);
            
            // If character is already in the set, remove from the left until it's unique
            while (charSet.contains(currentChar)) {
                charSet.remove(str.charAt(left));
                left++;
            }
            
            // Add current character to the set and move the right pointer
            charSet.add(currentChar);
            
            // Check if the current substring is the longest found
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
            
            right++;
        }
        
        // Return the longest substring
        return str.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";  // Example input
        String longestSubstring = findLongestSubstringWithoutRepeatingCharacters(input);
        
        System.out.println("Longest substring without repeating characters: \"" + longestSubstring + "\"");
    }

}

