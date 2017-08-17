package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/15.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
         a[i]=sc.nextInt();
        }
        int max=0;
        int count=0;
        for (int i=0;i<n;i++){
            if (max==a[i]){
                count++;
            }
            if (max<a[i]){
                max=a[i];
                count=1;
            }

        }
        System.out.println(count);
    }
}
