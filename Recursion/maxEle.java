/**
 *  Write a recursive function to find the maximum element in an array.
 */
import java.util.*;

 public class maxEle{

    public static int maxElement(int arr[],int n){
        //base case
        if(n<0){
            return Integer.MIN_VALUE;
        }

        //function call
        int max = maxElement(arr,n-1);;   
        //process
        return Math.max(max,arr[n]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The max element is: "+ maxElement(array,n-1));
        sc.close();
    }
 }