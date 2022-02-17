/**Write a java program to print the following pattern:
 *  A 
 *  B C 
 *  D E F
 *  G H I J
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class AlphaTri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of row: ");
        int row = sc.nextInt();
        char start='A';

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
        sc.close();
    }
}
