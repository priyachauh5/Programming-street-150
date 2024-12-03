//------------------------------------------------------------------------------------------------------------------
/* Checking for a Repeated Substring in a String
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to check if a substring is repeated within a given string.
Example:
Input: string = "abab"
Output: True
Explanation: The substring "ab" is repeated.*/
//------------------------------------------------------------------------------------------------------------------

public class Substring32{
    public static boolean repeatedSubstring(String str){
        int n=str.length();
        for(int i=1; i<=n/2; i++){
           if(n%i==0){
                String subString=str.substring(0,i);
                StringBuilder repeated=new StringBuilder();
                for(int j=0; j<n/i; j++){
                    repeated.append(subString);
                }
                if(repeated.toString().equals(str)){
                    return true;
                }
           }
        }
        return false;
    }
    public static void main(String args[]){
        String str="abab";
        System.out.println("String: "+str);
        System.out.print("Output: "+repeatedSubstring(str));
    }
}



