//-------------------------------------------------------------------------------------------------------------------
/* Printing Prime Numbers Less Than a Given Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to print all prime numbers less than a given number.
Example:
Input: number = 20
Output: 2, 3, 5, 7, 11, 13, 17, 19
Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class lessthanPrimeno24{
    public static void primeNo(int n){
        int i,j;
        System.out.print("Prime no is: ");
        for(i=1; i<=n; i++){
            for(j=2; j<i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(j+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        primeNo(n);
    }
}