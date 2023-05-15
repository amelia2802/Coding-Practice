/**
 * Write a recursive function to calculate the factorial of a number.
 */

import java.util.*;

public class factorial{

    public static int fact(int n){
        //base case
        if(n<=1){
            return 1;
        }

        //process + call the funtion
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println("Factorial of "+number+" is "+fact(number));
        sc.close();
    }
}