package testOnline;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class mostNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (!a.containsKey(t)) {
                a.put(t, 1);
            } else a.put(t, a.get(t) + 1);
        }
        int max = -1;
        int maxNum = 0;
        Iterator iter = a.keySet().iterator();
        while (iter.hasNext()) {
            int index = (int) iter.next();
            int t = a.get(index);
            if (t == max && index < maxNum) {
                maxNum = index;
            }
            if (t > max) {
                max = t;
                maxNum = index;
            }
        }
        System.out.println(maxNum);
    }
}
