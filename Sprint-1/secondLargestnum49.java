//------------------------------------------------------------------------------------------------------------------
/*Finding the Second Largest Number in an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the second largest number in an array.
Example:
Input: array = [10, 20, 4, 45, 99]
Output: 45
Explanation: The second largest number in the array is 45. */
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class secondLargestnum49{
    public static void secLarNum(int arr[]){
        int firstlarge=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(firstlarge<arr[i]){
                // firstlarge=arr[i];
                secondlarge=firstlarge;
                firstlarge=arr[i];
            }else if(secondlarge<arr[i] && firstlarge>arr[i]){
                secondlarge=arr[i];
            }
        }
        System.out.print("Second largest number is: "+secondlarge);
    }
    public static void main(String args[]){
        int arr[]={10,20,4,45,99};
        secLarNum(arr);
    }
}