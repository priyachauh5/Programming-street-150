import java.util.*;
public class arrayMedian32{
    public static void arrayMedian(int array){
        // int sort[]=new int[array.length];
        // int maxvalue=Integer.MIN_VALUE;
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>arr[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int array[]={3,1,2,4,5};
        arrayMedian(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }
}