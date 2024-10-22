//-------------------------------------------------------------------------------------------------------------------
/* Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class findarmStrongno17{
    public static boolean armstrongRange(int num){
        int originalNum=num;
        int arm=0;
        int digits=Integer.toString(num).length(); //converting the integer to a string and then finding its length to determine how many digits the number has.
        int rem=0;
        while(num>0){
            rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10; //num/=10;
            // System.out.print(arm);
        }
        return arm==originalNum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int n=sc.nextInt();
        System.out.print("Enter the ending range: ");
        int m=sc.nextInt();
        // armstrongRange(n,m);
        System.out.println("List of armstrong number present from"+n+"to"+m+"are: ");
        for(int i=n; i<=m; i++){
            if(armstrongRange(i)){
                System.out.println(i);
            }
        }
    }
}