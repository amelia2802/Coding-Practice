/**Write a java program to print the following pattern:
 *        * 
 *      * * 
 *    * * *
 *  * * * *
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class RevTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of row:");
        int row = sc.nextInt();

        //print spaces
        for(int i=1;i<=row;i++){
            int space = row-i;
            while(space>=0){
                System.out.print(" ");
                space--;
            }
                //print star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
