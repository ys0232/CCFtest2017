package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class turningPoint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n-1];
        int before=sc.nextInt();
        for (int i=1;i<n;i++){
            int curr=sc.nextInt();
            a[i-1]=curr-before;
            before=curr;
        }
        int count=0;
        for (int i=0;i<n-2;i++){
            if (a[i]*a[i+1]<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
