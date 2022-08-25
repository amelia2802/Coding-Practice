/***
A group of N students prepares together for upcoming programming competitions such as Kick Start and Code Jam by Google. To help each other prepare, it was decided that each student will pick a mentor among other students. A mentor will help their mentee to solve problems, learn algorithms, track their progress, and will generally support them throughout preparation.

Each student will have exactly one mentor among all other students, and a person can be a mentor to multiple people. For every student i we know their rating Ri which approximates how good that student is at programming competitions. Because it is believed that a mentor should not be much stronger than their mentee, a student j can be a mentor of student i only if Rj≤2×Ri. Note that a mentor can even have a rating that is lower or equal to their mentee's rating.

Unsurprisingly, each student wants to have the strongest possible mentor. For each student, can you help to figure out what is the highest possible rating of a mentor they can pick?

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of two lines.

The first line of each test case contains an integer N, representing the number of students in a group.

The second line of each test case contains N integers R1 R2 R3 … RN where Ri is a rating of the i-th student.

Output
For each test case, output one line containing Case #x: M1 M2 M3 … MN where x is the test case number (starting from 1), and Mi is the maximum possible rating of the i-th student's mentor or −1 if there are no suitable mentors for that student.
----------------------------------------------------------------------------------
Sample Input:
3
3
2000 1500 1900
5
1000 600 1000 2300 1800
2
2500 1200
----------------------------------------------------------------------------------
Sample Output:
Case #1: 1900 2000 2000
Case #2: 1800 1000 1800 1800 2300
Case #3: 1200 -1

*/



import java.util.*;

class studMent{
    public static int[] solve(int[] array, int N){
        int[] answer=new int[N];
        TreeSet<Integer> ts=new TreeSet<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            ts.add(array[i]);
            if(hm.containsKey(array[i]))
                hm.put(array[i],hm.get(array[i])+1);
            else
                hm.put(array[i],1);
        }
        for(int i=0;i<N;i++){
            int x=array[i]*2;
            int y=ts.floor(x)==null?-1:ts.floor(x);
            if(y==array[i] && hm.get(array[i])==1){
                y=ts.floor(array[i]-1)==null?-1:ts.floor(array[i]-1);
            }
            if(y==-1)
                answer[i]=-1;
            else{
                answer[i]=y;
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cp=0;
        while(t!=0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            cp++;
            int[] op = solve(arr,n);
            System.out.print("Case #"+cp+": ");
            for (int i = 0; i < op.length; i++){
                System.out.print(op[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}
