/**Write a java program to print the following pattern:
 *  D 
 *  C D 
 *  B C D
 *  A B C D
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class AlphaTri4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of row:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            char start = (char)('A'+row-i);
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
        sc.close();
    }    
}
