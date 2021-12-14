/**Write a java program to show that the give number is prime or not.
 * @author Amelia 
 * 
 */


 import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag = 0;           //Initialize a flag value
        System.out.println("Enter the number");
        int number = sc.nextInt();          //Take the number

        

        for(int i=2;i<number;i++){      //Chake the divisibility of the number
            if(number%i==0){
                flag = 1;
                break;
            }
        }

        if(flag==1){
            System.out.println("The number is not prime");
        }
        else if(number== 0 || number==1){           //Declare 0 and 1 as unique number
            System.out.println("This is a Unique Number");
        }
        else{
            System.out.println("This is a prime number");
        }
        sc.close();
    }
}
