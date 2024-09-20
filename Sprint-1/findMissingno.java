import java.util.*;
public class findMissingno{
    public static void main(String[] args){
        int[] array={1,1,2,3,5,5,7,9,9,9};
        int[] register=new int[array.length];
        for(int i: array){
            register[i]=1;
        }
        System.out.println("missing numbers in given array");
        for(int i=1; i<register.length; i++){
            if(register[i]==0){
                System.out.println(i);
            }
        }
    }
}

//space complexity of O(n).
//time complexity is O(n)+O(n) or O(2N).