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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] unsorted = new String[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = sc.next();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j=i+1;j<n;j++){
                int t=compare(unsorted[i],unsorted[j]);
                if (t==1){
                    String str=unsorted[i];
                    unsorted[i]=unsorted[j];
                    unsorted[j]=str;
                }
            }

        }
        for (int i=0;i<n;i++)
            System.out.println(unsorted[i]);
    }

}
