/**
 * Implement a recursive function to calculate the nth Fibonacci number.
 */
import java.util.*;

public class nthFibo {

    public static int fibo(int n){
        //base case
        if(n<=1){
            return n;
        }

        //process + function call
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println(number+"th fibonacci is "+fibo(number));
        sc.close();
    }
}
