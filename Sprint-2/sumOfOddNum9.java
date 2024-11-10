//------------------------------------------------------------------------------------------------------------------
/*Finding the Sum of the First N Odd Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to calculate the sum of the first N odd numbers.
Example:
Input: N = 5
Output: 25
Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class sumOfOddNum9{
    public static void sumOfOddNum(int n){
        int sum=0;
        for(int i=0; i<n; i++){
            int oddNum=2*i+1;
            sum+=oddNum;
        }
        System.out.print("Sum of odd number is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sumOfOddNum(n);
    }
}