//------------------------------------------------------------------------------------------------------------------
/*Finding the Mode of Numbers in an Array
Difficulty: Medium
Topics: Arrays, Statistical Analysis
Description: Write a program to find the mode (most frequent number) in an array.
Example:
Input: array = [1, 2, 2, 3, 4, 4, 4]
Output: 4
Explanation: The most frequent number in the array is 4.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class modeOfNum{
    public static int modeOfNum(int arr[]){
        Map<Integer, Integer> frequencyMap=new HashMap<>(); //stores each number as a key and its frequency as the value.

        //Build the frequency map
        for(int num: arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }
        //Find the mode by looking for the highest frequency
        int mode=Integer.MIN_VALUE;
        int maxFrequency=0;

        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            } else if (entry.getValue() == maxFrequency) {
                mode = Integer.MIN_VALUE;  // If there is no unique mode
            }
        }
        return mode;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of array: ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("Enter the elements in array: ");
       for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
       }
       int mode=modeOfNum(arr);
        if (mode != Integer.MIN_VALUE) { //If no mode exists (all elements have the same frequency), it returns Integer.MIN_VALUE.
            System.out.println("Mode: " + mode);
        } else {
            System.out.println("No mode found");
        }
    }
}