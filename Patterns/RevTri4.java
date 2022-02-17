/**Write a java program to print the following pattern:
 *  1111
 *   222
 *    33
 *     4
 * 
 * @author Amelia
 */

import java.util.Scanner; 
public class RevTri4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int row =sc.nextInt();

        for(int i=1;i<=row;i++){
            int space = i-1;
            int pt = row-i+1;
            for(int j=0;j<=row;j++){
                while(space>=0){
                    System.out.print(" ");
                    space--;
                }

                while(pt>0){
                    System.out.print(i);
                    pt--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
