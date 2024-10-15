import java.util.*;
public class searchFibno23{
    public static void main(String args[]){ 
        int arr[]={0,1,1,2,3,5,8,13,21,34,55};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the position between [1,10]: ");
        int n=sc.nextInt();
        for(int i=0; i<=10; i++){
            if(i==n){
            System.out.println(arr[i]);
            }
        }
    }

}