package testOnline;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class mediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (n > 1) {
            Arrays.sort(a);
            int medium = a[n / 2];
            int small = n / 2;
            int big = n - 1 - small;
            int k = n / 2 - 1;
            //System.out.println(a[k]+" "+k);
            while (k>=0 && a[k] == medium) {
                k--;
                small--;
            }
            if (k<0){
                small=0;
            }
            k = n / 2 + 1;
            while (k<=n-1 && a[k] == medium) {
                k++;
                big--;
            }
            if (k>n-1){
                big=0;
            }

            if (big == small) {
                System.out.println(medium);
            } else System.out.println(-1);
        } else System.out.println(a[0]);

        // System.out.println(Arrays.toString(a) + " " + medium + "  " + small + "____" + big);
    }
}
