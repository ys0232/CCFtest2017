package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/16.
 */
public class birthdaychocolateAns {
    static int solve(int n, int[] s, int d, int m) {
        int[] sum=new int[105];
        int count=0;
        sum[0]=0;
        for(int i=0;i<n;i++)sum[i+1]=sum[i]+s[i];
        for(int i=0;i<=n-m;i++){
            if(sum[i+m]-sum[i]==d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int result=solve(n,s,d,m);
        sc.close();
        System.out.println(result);

    }

}
