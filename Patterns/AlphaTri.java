/**Write a java program to print the following pattern:
 *  A
 *  B B 
 *  C C C
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class AlphaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+i-1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
