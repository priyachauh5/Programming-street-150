//------------------------------------------------------------------------------------------------------------------
/*Finding the N-th Triangular Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the N-th triangular number.
Example:
Input: N = 4
Output: 10
Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers).*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class NthTriangularNo36{
    public static void NthTriangularNo(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
        //BY using formula
        sum=n*(n+1)/2;
        System.out.print("Sum of Nth Triangular Number By using formula is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        NthTriangularNo(n);
    }
}