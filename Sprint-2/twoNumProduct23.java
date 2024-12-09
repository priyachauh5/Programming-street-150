//-------------------------------------------------------------------------------------------------------------------------
/*Finding the Sum of Digits of the Product of Two Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to find the sum of the digits of the product of two given numbers.
Example:
Input: number1 = 12, number2 = 34
Output: 9
Explanation: The product of 12 and 34 is 408, and the sum of its digits is 4 + 0 + 8 = 12.*/
//------------------------------------------------------------------------------------------------------------------

public class twoNumProduct{
    public static void digitSum(int n1, int n2){
        int product=0;
        int sum=0;
        if(n1>0){
            product=n1*n2;
        }
        System.out.println("Product of "+n1+" and "+n2+" is: "+product);
        while(product>0){
            int lastDigit=product%10;
            sum+=lastDigit;
            product=product/10;
        }
        System.out.print("Sum of product is :"+sum);

    }
    public static void main(String args[]){
        int n1=12;
        int n2=34;
        digitSum(n1, n2);
    }
}


