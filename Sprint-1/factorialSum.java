// import java.util.*;
// public class factorialSum{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n, fact=1, sum=0;
//         System.out.print("Enter the Number: ");
//         n=sc.nextInt();
//         for(int i=1; i<=n; i++){
//             fact=fact*i;
//             sum=sum+fact;
//         }
//         System.out.println("Factorail is: "+fact);
//         System.out.print("Sum of factorial is: "+sum);
//     }
// }

import java.math.BigInteger;
import java.util.Scanner;

public class factorialSum {

    // Method to calculate factorial using BigInteger
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to calculate the sum of the digits
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        String numberStr = number.toString();
        for (char digit : numberStr.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        BigInteger fact = factorial(number);
        int digitSum = sumOfDigits(fact);
        
        System.out.println("The sum of the digits of " + number + "! is: " + digitSum);
        
        scanner.close();
    }
}