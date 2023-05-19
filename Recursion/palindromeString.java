/**
 *  Write a recursive function to determine if a string is a palindrome.
 */

 import java.util.*;

 public class palindromeString{
    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }

        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }

        return isPalindrome(str,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        int n = str.length(); 
        int start = 0;
        int end = n-1;
        System.out.println(isPalindrome(str,start,end));
        sc.close();
    }
 }