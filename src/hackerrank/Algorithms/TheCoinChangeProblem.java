package hackerrank.Algorithms;

import java.util.*;

/**
 * Created by lenovo on 2017/8/18.
 */
public class TheCoinChangeProblem {

    static long getWays(long n, long[] c) {
        long ways = 0;
        //  Arrays.sort(c);
        ArrayList<Long> sum = new ArrayList<Long>();
        for (int i = 0; i < c.length; i++) {
            sum.add(c[i]);
        }
        while (!sum.isEmpty()) {
            for (int i = 0; i < sum.size(); i++) {
                long t = sum.remove(i);
                for (int j = 0; j < c.length; j++) {
                    long sumt = t + c[j];
                    System.out.println(sumt+" "+t+" "+c[j]);
                    if (sumt < n) {
                        sum.add(sumt);
                    }
                    if (sumt == n) {
                        ways++;
                    }
                }
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] c = new long[m];
        for (int i = 0; i < m; i++) {
            c[i] = sc.nextLong();
        }
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
