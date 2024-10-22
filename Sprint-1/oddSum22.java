//-------------------------------------------------------------------------------------------------------------------
/* Calculating the Sum of Odd Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all odd numbers within a given range.
Example:
Input: range = [1, 10]
Output: 25
Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25. */
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class oddSum22{
    public static void oddSum(int n, int m){
        int sum=0;
        for(int i=n; i<=m; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("Sum of Odd number: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("Enter the starting number: ");
        n=sc.nextInt();
        System.out.print("Enter the Ending number: ");
        m=sc.nextInt();
        System.out.print("Even no between "+ "["+ n+","+m+"] :");
        oddSum(n,m);
    }
    
}