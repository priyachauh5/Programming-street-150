//-------------------------------------------------------------------------------------------------------------------
/* Generating a Pattern of Numbers
Difficulty: Easy
Topics: Basic Programming, Patterns
Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).
Example:
Input: rows = 3
Output:

1  
2 3  
4 5 6  
Explanation: A number pattern with 3 rows is generated. */
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class pattern27{
    public static void numPattern(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){ //1 hai tho 1, 2 hai tho 2
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n=sc.nextInt();
        numPattern(n);
    }
}