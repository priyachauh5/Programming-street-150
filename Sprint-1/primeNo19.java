//-------------------------------------------------------------------------------------------------------------------
/* Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.*/
//-------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class primeNo{
    public static void primeNo19(int n, int m){
        int j;
       for(int i=n; i<=m; i++){
            for(j=2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            }
            // corner case
            if(i==j){
                System.out.print(j+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m,j;
        System.out.print("Enter the Starting range of number: ");
        n=sc.nextInt();
        System.out.print("Enter the Ending range of number: ");
        m=sc.nextInt();
        System.out.print("Prime no between "+ "["+ n+","+m+"] :");
        primeNo(n,m);
        
    }
}


           
        