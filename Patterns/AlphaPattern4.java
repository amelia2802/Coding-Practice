/**Write a java program to print the following pattern:
 *  A B C
 *  B C D
 *  C D E
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class AlphaPattern4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print((char)('A'+i+j-2)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}