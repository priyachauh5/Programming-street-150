//------------------------------------------------------------------------------------------------------------------
/* Finding Missing Numbers in a Sequence
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find missing numbers in a sequence from 1 to n.
Example:
Input: sequence = [1, 2, 4, 5]
Output: [3]
Explanation: The missing number in the sequence from 1 to 5 is 3.*/
//------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class findMissingno30{

    // public static void main(String[] args){
    //     int[] array={1,1,2,3,5,5,7,9,9,9};
    //     int[] register=new int[array.length];
    //     for(int i: array){ //each element s assigned once at a time
    //         register[i]=1;
    //     }
    //     System.out.println("missing numbers in given array");
    //     for(int i=1; i<register.length; i++){
    //         if(register[i]==0){
    //             System.out.println(i);
    //         }
    //     }
    // }
//---------------------------------------------------------------------------------------------------------------------
    //Array should not have duplicates
    //Array no need to be stored order
    //Values should be ib range
    public static void main(String args[]){
        int a[]={1,2,4,5};
        //1+2+4+5=12 sum1
        //1+2+3+4+5=15 sum2
        //sum2-sum1=15-12=3 missing
        int sum1=0;
        for(int i=0; i<a.length; i++){
            sum1=sum1+a[i];
        }
        System.out.println(sum1);

        int sum2=0;
        for(int i=1; i<=5; i++){
            sum2=sum2+i;
        }
        System.out.println(sum2);
        int sum3=sum2-sum1;
        System.out.print("Missing no. is: "+sum3);
    }

}

//space complexity of O(n).
//time complexity is O(n)+O(n) or O(2N).