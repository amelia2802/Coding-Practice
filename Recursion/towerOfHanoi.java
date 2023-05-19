/**
 * Implement a recursive function to solve the Tower of Hanoi problem.
 */

 import java.util.*;

public class towerOfHanoi {

    public static void solveTOH(int disk,char source,char dest,char lobby){

        //base case
        if(disk==1){
            System.out.println("Move disk 1 from "+source+" to "+dest);
            return;
        }

        solveTOH(disk-1,source,lobby,dest);
        System.out.println("Move disk "+disk+" from "+source+" to "+dest);
        solveTOH(disk-1,lobby,dest,source);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disk:");
        int disk = sc.nextInt();

        solveTOH(disk,'A','C','B');
        sc.close();
    }
}
