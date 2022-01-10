/**Write a java program to print the following pattern:
 *  321
 *  321
 *  321
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                int ptr = row -j+1;     //reverse the digits
                System.out.print(ptr+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
