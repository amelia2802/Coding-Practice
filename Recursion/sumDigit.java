/**
 * Write a recursive function to calculate the sum of digits of a number.
 */

 import java.util.*;

 public class sumDigit{
    public static int digitSum(int n){
        //base case
        if(n==0){
            return 0;
        }
        
        return (n%10+digitSum(n/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt(); 
        
        System.out.println("Summation is: "+digitSum(number));
        sc.close();
    }
 }