/**Write a java program to print the following pattern:
 *  1
 *  22
 *  333
 *  4444
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class triangle2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
