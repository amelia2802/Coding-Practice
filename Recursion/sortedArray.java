/**
 * Implement a recursive function to check if an array is sorted in ascending order.
 */

 import java.util.*;
public class sortedArray {
    public static boolean isSorted(int[] arr,int n){
        if(n<=1){
            return true;
        }
        if(arr[n-1]<arr[n-2]){
            return false;
        }
        return isSorted(arr,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Is the given array sorted? "+isSorted(arr,size));
        sc.close();
    }
}
