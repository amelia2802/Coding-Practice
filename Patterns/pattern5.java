/**Write a java program to print the following pattern:
 *  1234
 *  1234
 *  1234
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j = 1;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}