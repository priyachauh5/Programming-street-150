//------------------------------------------------------------------------------------------------------------------
/*Finding the Difference Between the Sum of Even and Odd Numbers in an Array
Difficulty: Easy
Topics: Arrays, Mathematical Computations
Description: Write a program to calculate the difference between the sum of even and odd numbers in an array.
Example:
Input: array = [1, 2, 3, 4, 5, 6]
Output: 4
Explanation: The sum of even numbers is 12, and the sum of odd numbers is 8. The difference is 4.*/
//------------------------------------------------------------------------------------------------------------------

public class evenOddSum{
    public static void evenOddSum(int arr[]){
        int evenSum=0;
        int oddSum=0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                evenSum+=arr[i];
            }
        }
        System.out.println("Sum of even number is: "+evenSum);
        for(int i=0; i<arr.length; i++){
            if(i%2!=0){
                oddSum+=arr[i];
            }
        }
        System.out.println("Sum of odd number is: "+oddSum);
        int diff=oddSum-evenSum;
        System.out.print("Difference of the Even and Odd number is: "+diff);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        evenOddSum(arr);
    }
}
