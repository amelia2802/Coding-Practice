/**
 * Implement a recursive function to calculate the power of a number.
 */

 import java.util.*;

public class NumPower {

    public static int powerNum(int a,int b){
        if(b==0){
            return 1;
        }

        if(a==0){
            return 0;
        }

        if(b<0){
            return 1/a * powerNum(a,-b-1);
        }

        return a * powerNum(a,b-1);

    }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int number = sc.nextInt();
    System.out.println("Enter the power:");
    int power = sc.nextInt();

    System.out.println(number+" power "+power+" is: "+powerNum(number,power));
    sc.close();
 }   
}
