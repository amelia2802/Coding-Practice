/**Write a java program to print the following pattern:
 *  ****
 *   ***
 *    **
 *     *
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class RevTri3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            int space=i-1;
            int star = row-i+1;

            for(int j=1;j<=row;j++){
                while(space>=0){
                    System.out.print(" ");
                    space--;
                }

                while (star>0) {
                    System.out.print("*");
                    star--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
