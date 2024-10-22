//-------------------------------------------------------------------------------------------------------------------
//Finding the Sum of Prime Numbers in a Range
// Difficulty: Medium
// Topics: Number Theory, Mathematical Computations
// Description: Write a program to calculate the sum of all prime numbers within a given range.
// Example:
// Input: range = [1, 10]
// Output: 17
// Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class primeSumRange35{
    public static void primeSumRange(int n, int m){
        int i, j;
        int sum=0;
        for(i=n; i<=m; i++){
            for(j=2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            }
            // corner case
            if(i==j){
                System.out.print(j+" ");
                sum=sum+j;
            }
        }
        System.out.println();
        System.out.print("Sum of prime number in range is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int n=sc.nextInt();
        System.out.print("Enter the ending number: ");
        int m=sc.nextInt();
        primeSumRange(n,m);
    }
}