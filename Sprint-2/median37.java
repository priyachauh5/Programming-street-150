//------------------------------------------------------------------------------------------------------------------
/* Finding the Median of a List of Numbers
Difficulty: Medium
Topics: Sorting, Mathematical Computations
Description: Write a program to find the median value of a list of numbers.
Example:
Input: list = [3, 1, 4, 1, 5]
Output: 3
Explanation: After sorting the list to [1, 1, 3, 4, 5], the median is 3. */
//------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;
public class median{
    public static void arrayMedian(int arr[]){
        Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));
        int n=arr.length;
        if(n%2==1){
            System.out.print("Median of the array is: "+arr[n/2]);
        }
    }
    public static void main(String args[]){
        int arr[]={3,1,4,1,5};
        arrayMedian(arr);
    }
}


