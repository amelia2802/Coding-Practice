/*
 * Implement a recursive function to reverse a string.
 */

import java.util.*;

public class reverseString {

    public static String reverse(String str,int n){

        //base case
        if(n<0){
            return "";
        }

        //method + function call
        return (String)(str.charAt(n) + reverse(str,n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String");
        String inputStr = sc.next();

        int strLength = inputStr.length();

        System.out.println("The reversed string: "+reverse(inputStr,strLength-1));
        sc.close();
    }
}
