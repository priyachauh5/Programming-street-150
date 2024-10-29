//------------------------------------------------------------------------------------------------------------------
/*Generating a Number Pyramid
Difficulty: Medium
Topics: Patterns, Basic Programming
Description: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).
Example:
Input: rows = 4
Output:

1  
12  
123  
1234  
Explanation: A number pyramid with 4 rows is generated. */
//------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class numPyramid47{
    public static void numPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n=sc.nextInt();
        numPyramid(n);
    }
}