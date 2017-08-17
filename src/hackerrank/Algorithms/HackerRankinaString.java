package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/16.
 */
public class HackerRankinaString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {

            String s = sc.next();
            char[] t="hackerrank".toCharArray();
            int k=0;
            for (int j = 0; j < s.length(); j++) {
                if (t[k]==s.charAt(j)){
                    k++;
                }
                if (k==t.length){
                    break;
                }
            }
            if (k==t.length){
                System.out.println("YES");
            }else
            System.out.println("NO");
        }
    }

}
