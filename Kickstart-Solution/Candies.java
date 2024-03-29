/**
You have gathered N bags of candy and you want to distribute the candy amongst M kids. The i-th bag contains Ci pieces of candy. You want to make sure that every kid get the same amount of candy and that the number of pieces of candy they receive is the greatest possible. You can open each bag and mix all pieces of candy before distributing them to the kids.

How many pieces of candy will remain after you share the candy amongst kids, based on the rules described above?

Input
The first line of the input gives the number of test cases, T. T test cases follow.

Each test case consists of two lines. The first line of each test case contains two integers: integer N, the number of candy bags, and M, the number of kids.

The next line contains N non-negative integers C1,C2,…,CN representing array C, where the i-th integer represents the number of candies in the i-th bag.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of candies that will remain if you divide candies between kids according to the rules described above.
-----------------------------------------------------------------------------
Input:
2
7 3
1 2 3 4 5 6 7
5 10
7 7 7 7 7
-----------------------------------------------------------------------------
Output:
Case #1: 1
Case #2: 5
*/


import java.util.*;

class Candies{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a=1;a<=t;a++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sum=0;
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            
            int get = sum/k;
            
            int remain = sum - (get*k);
            System.out.println("Case #"+a+": "+remain);
        }
    }
}
