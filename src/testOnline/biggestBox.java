package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/18.
 */
public class biggestBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
            }
        }
        long area = min * n;
        long tempArea = a[0];
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                k++;
                tempArea = a[i] * k;
            } else {
                tempArea = a[i - 1] * k;
            }
            if (tempArea < area) {
                k = 1;
            } else {
                area = tempArea;
            }

        }
        System.out.println(area);

    }
}
