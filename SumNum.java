/**
 * Write a Java program to show the summation of n numbers.
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class SumNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int sum = 0;        //asiign the sum value 0

        for(int i=1;i<=number;i++){     //Initialize a loop from 1 to number and add the numbers corespondingly to the sum variable
            sum = sum+i;
        }
        System.out.println("The summation is: "+sum);   //print the sum value
        sc.close();

    }
}
