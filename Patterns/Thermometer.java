/**
 * Write a java program to convert the Fahrenheit temperature to Celsius.
 * @author Amelia
 */

import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temp: ");
        double f = sc.nextInt();        //Took the Fahrenheit value

        double c = (f-32.0) * (5.0/9.0);        //formula of the Fahrenheit to Celsius conversion
        
        System.out.println("The Celsius Temperature is: "+c);   //Print the Celsius value

        sc.close();

    }
}
