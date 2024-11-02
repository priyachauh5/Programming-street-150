//------------------------------------------------------------------------------------------------------------------
/*Finding the Average of Numbers in an Array
Difficulty: Easy
Topics: Arrays, Mathematical Computations
Description: Write a program to calculate the average of numbers in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 3
Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class NumberAvg44{
    public static void numAvg(int arr[]){
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of element: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter"+n+"elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //print array
        for(int i=0; i<n; i++){
            System.out.print("Length of array: "i+" ");
        }
    }
}
