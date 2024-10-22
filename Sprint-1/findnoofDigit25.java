//-------------------------------------------------------------------------------------------------------------------
/* Finding the Number of Digits in a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to count the number of digits in a given number.
Example:
Input: number = 12345
Output: 5
Explanation: The number 12345 has 5 digits*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class findnoofDigit25{
    public static void digit(int n){
        int count=0;
        System.out.print("Total number of Digit: ");
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int n=sc.nextInt();
        digit(n);
    }
}

//suppose no is: 1,2,3,4,5
// n=n/10 n=1,2,3,4 count=1
// n=n/10 n=1,2,3 count=2
// n=n/10 n=1,2 count=3
// n=n/10 n=1 count=4
// n=n/10 n=0 count=5 as 1>0 from while condition
// while(0>0){
    // come out from while loop
//}