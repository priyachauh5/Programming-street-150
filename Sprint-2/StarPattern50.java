//------------------------------------------------------------------------------------------------------------------
/*Generating a Triangle Pattern of Stars with a Given Height
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a triangle pattern of stars with a specified height.
Example:
Input: height = 4
Output:

*  
**  
***  
****  */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class StarPattern50{
    public static void starPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int n=sc.nextInt();
        starPattern(n);
    }
}
