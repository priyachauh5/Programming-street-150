//------------------------------------------------------------------------------------------------------------------
/*Finding All Pairs of Elements in an Array that Add Up to a Given Sum
Difficulty: Medium
Topics: Arrays, Hashing
Description: Write a program to find all pairs of elements in an array whose sum equals a specified target.
Example:
Input: array = [1, 2, 3, 4, 5], target = 5
Output: [(1, 4), (2, 3)]
Explanation: Pairs that sum up to 5 are (1, 4) and (2, 3).*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class findAllPairOfElement4{
    public static void findSumUpToGivenSum(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]<target){
                start++;
            }else if(arr[start]+arr[end]>target){
                end--;
            }else if(arr[start]+arr[end]==target){
                System.out.println("Pair ("+arr[start]+","+arr[end]+")");
                start++;
                end--;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target=5;
        findSumUpToGivenSum(arr, target);
    }
}