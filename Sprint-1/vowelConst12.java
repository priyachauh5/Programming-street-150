import java.util.*;
public class vowelConst12{
    void count(String str){
        int vowels=0, consonants=0;
        str=str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch));
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonants); 
    }
  
    public static void main(String args[]){
       vowelConst obj=new vowelConst();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input: ");
        String str=sc.next();
        obj.count(str);
    }
}