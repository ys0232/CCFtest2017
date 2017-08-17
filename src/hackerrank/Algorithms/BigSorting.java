package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class BigSorting {
    static int compare(String a, String b) {
        int f = 0;
        if (a.equals(b)) {
            return 0;
        }
        if (a.length() > b.length()) {
            f = 1;
        } else if (a.length() < b.length()) {
            f = -1;
        } else {
            int len = a.length();
            for (int i = 0; i < len; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    int t1 = Integer.valueOf(a.charAt(i));
                    int t2 = Integer.valueOf(b.charAt(i));
                    if (t1 > t2) {
                        f = 1;
                    }
                    if (t1 < t2) {
                        f = -1;
                    }
                    if (t1 == t2) {
                        f = 0;
                    }
                    break;
                }
            }
        }
        return f;
    }

    static int partition(String[] a, int low, int high) {
        int q = low;
        String x = a[high];
        int i = low - 1;
        String str;
        for (int j = low; j < high; j++) {
            int t = compare(a[j], x);
            if (t == -1) {
                i++;
                str = a[i];
                a[i] = a[j];
                a[j] = str;
            }
        }
        str = a[i + 1];
        a[i + 1] = a[high];
        a[high] = str;
        return i + 1;
    }

    static void quicksort(String[] a, int low, int high) {
        if (low < high) {
            int q = partition(a, low, high);
            quicksort(a, low, q - 1);
            quicksort(a, q + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] unsorted = new String[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = sc.next();
        }

        quicksort(unsorted,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.println(unsorted[i]);
    }

}
