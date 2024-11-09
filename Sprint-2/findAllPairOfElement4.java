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
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; i++){
                for(int k=i; k<j; k++){
                    if((i+j)==target){
                        sum=i+j;
                        System.out.print("("+i+","+j+")");
                        i++;
                        j++;
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        System.out.print("Array are: ");
        int arr[]={1,2,3,4,5};
        int target=5;
        findSumUpToGivenSum(arr, target);
    }
}