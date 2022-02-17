/**Write a java program to print the following pattern:
 *     1
 *    121
 *   12321
 *  1234321
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class dabanggPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row no:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            int space=row-i;
            //print space
            while(space>=0){
                System.out.print(" ");
                space--;
            }

            //print left triangle
            for(int j=1;j<=i;j++){
                int cp=j;
                System.out.print(cp);
                cp++;
            }

            //print right triangle
            int pt=i-1;
            while(pt>0){
                System.out.print(pt);
                pt--;
            }
            System.out.println();
        }
        sc.close();
    }
}
