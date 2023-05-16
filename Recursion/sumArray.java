/**
 *  Write a recursive function to find the sum of all elements in an array.
 */
import java.util.*;

public class sumArray{

    public static int sum(int arr[],int n){
        
        //base case
        if(n<0){
            return 0;
        }

        //method + function call

        return arr[n]+sum(arr,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of the elements of array is: "+sum(arr,n-1));
        sc.close();
    }
}