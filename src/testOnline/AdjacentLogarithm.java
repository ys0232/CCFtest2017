package testOnline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class AdjacentLogarithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for (int i=0;i<n-1;i++){
            if (a[i+1]-a[i]==1){
                count++;
            }
        }
        System.out.println(count);

    }
}
