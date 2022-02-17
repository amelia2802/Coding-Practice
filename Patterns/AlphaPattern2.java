/**Write a java program to print the following pattern:
 *  AAA
 *  BBB
 *  CCC
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class AlphaPattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows:");
        int row = sc.nextInt();
        char start = 'A';
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(start+" ");
            }
            start++;
            System.out.println();
        }
        sc.close();
    }
}