//------------------------------------------------------------------------------------------------------------------
/*Finding the Median of an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the median of an array of numbers.
Example:
Input: array = [3, 1, 2, 4, 5]
Output: 3
Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.*/
//------------------------------------------------------------------------------------------------------------------


import java.util.*;
public class arrayMedian32{
    public static void arrayMedian(int array){
        int sort[]=new int[array.length];
        int maxvalue=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(maxvalue<sort[i]){
                
            }
        }
    }
    public static void main(String args[]){
        int array[]={3,1,2,4,5};
        arrayMedian(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }
}