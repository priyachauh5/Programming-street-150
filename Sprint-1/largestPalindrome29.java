import java.util.Scanner;

public class largestPalindrome29{

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to find the largest palindrome in the string
    public static String findLargestPalindrome(String str) {
        String largestPalindrome = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > largestPalindrome.length()) {
                    largestPalindrome = substring;
                }
            }
        }
        return largestPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String largestPalindrome = findLargestPalindrome(input);
        
        if (!largestPalindrome.isEmpty()) {
            System.out.println("The largest palindrome in the string is: " + largestPalindrome);
        } else {
            System.out.println("No palindrome found in the string.");
        }

        scanner.close();
    }
}