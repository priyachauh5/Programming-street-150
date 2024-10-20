import java.util.*;
public class vowelConst{
    public static void count(String str){
        int vowels=0, consonants=0;
        str=str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){ //check whether a given char is letter
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonants); 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        count(str);
    }
}