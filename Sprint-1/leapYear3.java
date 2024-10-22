//-------------------------------------------------------------------------------------------------------------------
/*Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class leapYear3{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0 && n%100!=0 || n%100==0 && n%400==0){
            System.out.println("Number is leap year");
        }else{
            System.out.println("Number is not leap year");
        }
    }
}