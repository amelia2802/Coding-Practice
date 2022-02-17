/**Write a java program to print the following pattern:
 *  1
 *  23
 *  456
 *  78910
 * 
 * @author Amelia
 */
import java.util.Scanner;

public class triangle3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of row:");
        int row = sc.nextInt();

        int start = 1;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start = start+1;        //increase the count value
            }
            System.out.println();
        }
        sc.close();
    }   
}
