import java.util.*;
public class sortArray15{
    public static void main(String args[]){
        int arr[]={3,1,4,1,5,9};
        System.out.print("Original array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=1+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}