package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/6.
 */
public class OppositeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[1001];
        int count=0;
        for (int i=0;i<n;i++){
            int t=sc.nextInt();
            t=Math.abs(t);
            if (a[t]!=0){
                count++;
                a[t]--;
            }else {
                a[t]++;
            }
        }
        System.out.println(count);
    }
}
