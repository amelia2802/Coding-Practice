/** write a java program to show the sum of all even numbers upto n 
 * @author Amelia
*/

import java.util.Scanner;

public class EveSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;

        for(int i=2;i<=number;){    //Take the even number into i, initialize i = 2 as 2 is the least even number
            sum = sum + i;      //add the sum
            i=i+2;              //increment the i value with 2
        }
        System.out.println("The sum of even numbers is:"+sum);

        sc.close();
    }    
}
