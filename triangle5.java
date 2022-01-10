/**Write a java program to print the following pattern:
 *  1
 *  21
 *  321
 *  4321
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class triangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            int start = i;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start = start-1;
            }
            System.out.println();
        }
        sc.close();
    }    
}
