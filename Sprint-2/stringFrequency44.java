//------------------------------------------------------------------------------------------------------------------
/*Finding the Frequency of Each Character in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to count the frequency of each character in a given string.
Example:
Input: string = "hello"
Output: {'h': 1, 'e': 1, 'l': 2, 'o': 1}
Explanation: The frequency of each character in the string "hello" is shown. */
//------------------------------------------------------------------------------------------------------------------

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print the frequency of each character
        System.out.println("Character frequencies: " + frequencyMap);

        scanner.close();
    }
}


