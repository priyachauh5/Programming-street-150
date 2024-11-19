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
2 3 5  */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class primePattern38{
    public static void primePattern(int n){
        int count = 0; // Counter for the number of primes found
        int num = 2;   // Starting number to check for primes

        for (int i = 1; i <= n; i++) {
            count = 0;
            num = 2; // Reset the starting number for each row
            while (count < i) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=sc.nextInt();
        primePattern(n);
    }
}