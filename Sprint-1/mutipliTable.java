import java.util.*;
public class mutipliTable{
    public static void multiple(int n){
        for(int i=0; i<=10; i++){
            int mult=n*i;
            System.out.println(n+"x"+i+"="+mult);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the Table number: ");
        n=sc.nextInt();
        multiple(n);
    }
}