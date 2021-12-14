/**
 * Write a java program to prit the following pattern
 *      ****
 *      ****
 *      ****
 *      ****
 */

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = sc.nextInt();

        for(int i = 1;i<=row;i++){      //Initialize the rows from 1 to the number
            for(int j = 1;j<=row;j++){      //Initiaize the columns from 1 to row number
                System.out.print("* ");     //print the star
            }
            System.out.println("");         // move to next line
        }
        sc.close();
    }
}
