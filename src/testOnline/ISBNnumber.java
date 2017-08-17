package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class ISBNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] s = str.split("-");
        int mod = 0;
        int k = 1;
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                mod += (Integer.valueOf(s[i].charAt(j) - '0') * k) % 11;
                k++;
            }
        }
        mod = mod % 11;
        //  System.out.println(mod+" "+s[s.length - 1]);
        if (mod < 10 && s[s.length - 1].equals(String.valueOf(mod))) {
            System.out.println("Right");
        } else if (mod == 10 && s[s.length - 1].equals("X")) {
            System.out.println("Right");
        } else {
            String str1 = "";
            for (int i = 0; i < str.length() - 1; i++) {
                str1 += str.charAt(i);
            }
            if (mod < 10){
                str1 += mod;
            } else str1 += 'X';
            System.out.println(str1);
        }
    }
}
