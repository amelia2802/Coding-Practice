/**Write a java program to print the following pattern:
 *  A B C
 *  A B C
 *  A B C
 * 
 * @author Amelia
 */
import java.util.Scanner;


public class AlphaPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int row = sc.nextInt();
        char start = 'A';

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print((char)(start+j-1)+" ");    //typecasted the int value to char
            }
            System.out.println();
        }
        sc.close();
    }
}
