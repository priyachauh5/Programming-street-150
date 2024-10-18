public class arraySum16{
    public static void arraySum(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        System.out.print("Sum of array: "+sum);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8,9};
        arraySum(array);
    }
}