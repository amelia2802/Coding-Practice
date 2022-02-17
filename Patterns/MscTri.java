/**Write a java program to print the following pattern:
 *     1
 *    22
 *   333
 *  4444
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class MscTri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            int space= row-i;
             //print space
             while(space>=0){
                System.out.print(" ");
                space--;
            }
            for(int j=1;j<=i;j++){
                //print number
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();;
    }
}
