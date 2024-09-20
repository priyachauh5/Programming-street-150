import java.util.*;
public class reverseStr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str;
        char ch;
        String reverseStr="";
        str=sc.next();
        for(int i=0; i<str.length(); i++){
            ch=str.charAt(i);
            reverseStr=ch+reverseStr;
        }
        System.out.println("Reversed String is: "+ reverseStr);
    }
}