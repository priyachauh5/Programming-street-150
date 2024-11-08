//-------------------------------------------------------------------------------------------------------------------
/*Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.*/
//-------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class primeNum2{
    public static boolean primeNo(int n){
        int m=n;
        //corner case
        if(m==2){
            return true;
        }
        for(int i=2; i<=m-1; i++){
            if(m%i==0){
                return false;
            } 
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        if(primeNo(n)){ //from above function
            System.out.println(n+" Number is a prime number");
        }else{
            System.out.println(n+" Number is not prime");
        }
    }
}


