package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class AccessControlSystem {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[1001];
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int t=sc.nextInt();
            a[t]++;
            System.out.print(a[t]+" ");
        }
    }
}
