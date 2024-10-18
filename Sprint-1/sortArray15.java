import java.util.*;
public class sortArray15{ //using swapping
    public static void swapping(int array[]){
        int start=0, end=array.length-1; //bcos starting from 0
            while(start<end){
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
            }
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        swapping(array);
        //to print the values
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    // public static void main(String args[]){
    //     int arr[]={3,1,4,1,5,9};
    //     System.out.print("Original array: ");
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     int temp=0;
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=1+1;j<arr.length;j++){
    //             if(arr[j]<arr[i]){
    //                 temp=arr[i];
    //                 arr[i]=arr[j];
    //                 arr[j]=temp;
    //             }
    //         }
    //     }
    //     System.out.println();
    //     System.out.print("Sorted array: ");
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
}