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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of element: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" elements: "+" ");
        int sum=0, avg=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            avg=sum/n;
        }
        System.out.println("Average of number is: "+avg);
    }
}
