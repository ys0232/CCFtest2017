package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        char[] t = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String result;
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'
                ) {
            char temp = s.charAt(0);
            result = String.valueOf(t[(temp - 'a' + k) % 26]);
        } else if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            char temp = s.charAt(0);
            String str = String.valueOf(t[(temp - 'A' + k) % 26]);
            result = str.toUpperCase();
        } else result = String.valueOf(s.charAt(0));

        for (int i = 1; i < len; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    ) {
                char temp = s.charAt(i);
                result += String.valueOf(t[(temp - 'a' + k) % 26]);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char temp = s.charAt(i);
                String str = String.valueOf(t[(temp - 'A' + k) % 26]);
                result += str.toUpperCase();
            } else result += String.valueOf(s.charAt(i));
        }
        System.out.println(result);
    }
}
