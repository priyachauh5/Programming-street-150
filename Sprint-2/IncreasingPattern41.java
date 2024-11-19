//------------------------------------------------------------------------------------------------------------------
/*Generating a Pattern of Increasing Numbers
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a pattern where numbers increase with each row.
Example:
Input: rows = 3
Output:

1  
12  
123*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class IncreasingPattern41{
    public static void incPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        incPattern(n);
    }
}