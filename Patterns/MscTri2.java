/**Write a java program to print the following pattern:
 *     1
 *    23
 *   456
 *  78910
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class MscTri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row no:");
        int row = sc.nextInt();
        int pt=1;

        for(int i=1;i<=row;i++){
            int space=row-i;
            
            //print space
            while(space>=0){
                System.out.print(" ");
                space--;
            }
            for(int j=1;j<=i;j++){
                System.out.print(pt);
                pt++;
            }
            
            System.out.println();
        }
        sc.close();;
    }
}