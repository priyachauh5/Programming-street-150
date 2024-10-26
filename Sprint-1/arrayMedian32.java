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
    public static void bubbleSort(int array[]){
       for(int i=0; i<array.length-i; i++){
            for(int j=0; j<array.length-1-i; j++){  //calculate no. of turns
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            } 
       }
    }
    public static void arrayMid(int array[]){
           for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int n=array.length;
        int start=0, end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            System.out.print("Array mid is:"+array[mid]);
            break;
        }
    }
    public static void main(String args[]){
        int array[]={3,1,2,4,5};
        bubbleSort(array);
        arrayMid(array);
    }
}