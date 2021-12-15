/**abstractWrite a java progrm to show the following outut:
 *  123
 *  456
 *  789
 * 
 * @author Amelia
 */
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = sc.nextInt();

        int pt = 1;     //initialize a point value 1 to print the numbers

        for(int i=1;i <= row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(pt +" ");
                pt=pt+1;
            }
            System.out.println("");
        }
        sc.close();
    }
}
