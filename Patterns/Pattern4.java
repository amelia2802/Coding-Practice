/**Write a java program to print the following pattern:
 *  987
 *  654
 *  321
 * 
 * @author Amelia
 */


 import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        int pt = row*row;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print((pt+" "));
                pt=pt-1;
            }
            System.out.println("");
        }
        sc.close();
    }
}
