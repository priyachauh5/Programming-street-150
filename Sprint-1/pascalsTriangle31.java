//------------------------------------------------------------------------------------------------------------------
/* Generating a Pascal’s Triangle
Difficulty: Medium
Topics: Arrays, Mathematical Computations
Description: Write a program to generate Pascal's Triangle up to a given number of rows.
Example:
Input: rows = 4
Output:

1  
1 1  
1 2 1  
1 3 3 1  
Explanation: Pascal's Triangle with 4 rows is generated.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class pascalsTriangle31{
    public static void pascal(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("1");
                }else{
                    int k=i-1;
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n=sc.nextInt();
        pascal(n);
    }
}