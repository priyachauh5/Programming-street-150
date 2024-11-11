//------------------------------------------------------------------------------------------------------------------
/*Generating a Pattern of Prime Numbers
Difficulty: Medium
Topics: Prime Numbers, Patterns
Description: Write a program to generate a pattern where each row contains the first few prime numbers.
Example:
Input: rows = 3
Output:

2  
2 3  
2 3 5    */
//------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;

public class PrimePattern {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to generate the first n prime numbers
    public static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    public static void main(String[] args) {
        int rows = 3; // You can change the number of rows here
        int primeCount = rows * (rows + 1) / 2; // Total prime numbers needed

        // Generate the required number of primes
        ArrayList<Integer> primes = generatePrimes(primeCount);

        int index = 0;
        // Print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(primes.get(index++) + " ");
            }
            System.out.println();
        }
    }
}
