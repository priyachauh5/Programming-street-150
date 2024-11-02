//------------------------------------------------------------------------------------------------------------------
/*Finding the Sum of Prime Factors of a Number
Difficulty: Medium
Topics: Number Theory, Mathematical Computations
Description: Write a program to find the sum of the prime factors of a given number.
Example:
Input: number = 12
Output: 5
Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class primeFactorSum{
    public static void primeFactorSum(int n){
        int sum=0;
        for(int i=2; i<n; i+=1){ //After each iteration, i is incremented by 1, 
            while(n%i==0){
                n=n/i;
                System.out.println(i);
                sum=i+n;
            }
        }
        System.out.print("Sum of Prime factor is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        primeFactorSum(n);
    }
}