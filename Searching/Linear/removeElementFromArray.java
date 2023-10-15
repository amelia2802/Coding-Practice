/**
 * Write a function called 'removeElement' that takes an array of integers and a target integer as arguments. The function should modify the array in-place by removing all instances of the target integer and returning the new length of the array.
 * 
 * Example
removeElement([3, 2, 2, 3], 3) => 2
 */

 import java.util.*;

 class removeElementFromArray{
    public static int removeElement(int[] array,int arrlength,int target){
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for(int i=0;i<arrlength;i++){
            if(array[i]!=target){
                resultArray.add(array[i]);
            }
        }

        return resultArray.size();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int arrlen= sc.nextInt();
        int inputArray[] = new int[arrlen];
        System.out.println("Enter elements of array:");
        for(int i=0;i<arrlen;i++){
            inputArray[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        System.out.println(removeElement(inputArray,arrlen,target));
    } 
 }