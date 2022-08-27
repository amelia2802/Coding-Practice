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
