/**Write a java program to print the following pattern:
 *  1234554321
 *  1234**4321
 *  123****321
 *  12******21
 *  1********1
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class ultraPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ouf row:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){

            //print 1st triangle
            int tri1= row-i+1;
            for(int j=1;j<=tri1;j++){   
                    System.out.print(j);
                }
            

            //print star
            int star= 2*(i-1);
            while(star>0){
                System.out.print("*");
                star--;
            }
           
            //print 2nd triangle
            int tri2=row-i+1;
            while(tri2>0){
                System.out.print(tri2);
                tri2--;
            }

            System.out.println();
        }
        sc.close();;
    }
}
