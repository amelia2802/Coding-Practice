/**
 * Write a java program , where if a charecter is in between 'a-z' the output will show "The charecter is lowercase",
 * or if is in "A-Z" shown "The charecter is in Uppercase", if in "0-9" will shown "Numeric" 
 * if special charecter then show "Special Charecter."
 * 
 * @author Amelia
 */

import java.util.Scanner;

public class CharSrc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter:"); 
        char ch = sc.next().charAt(0);      //Take the input from user

        //Search that the charecter is Uppercase or Lowercase or Numeric or a special charecter
        if(ch >='A' && ch <='Z'){
            System.out.println("The charecter is in UpperCase");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("The charecter is in LowerCase");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("The charecter is Numeric");
        }
        else{
            System.out.println("This is a special Charecter");
        }

        sc.close();

    }
}
