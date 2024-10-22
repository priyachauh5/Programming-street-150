//-------------------------------------------------------------------------------------------------------------------
/*Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.

 */
//-------------------------------------------------------------------------------------------------------------------

public class largestandsmall14{
    public static void largest(int array[]){
       int largest=Integer.MIN_VALUE; //minus infinity
        for(int i=0; i<array.length; i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("Largest of array is: "+largest);
    }
    public static void smallest(int array[]){
        int smallest=Integer.MAX_VALUE;  //plus infinity
        for(int i=0; i<array.length; i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("smallest of array is: "+smallest);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8,9};
        largest(array);
        smallest(array);
    }
}