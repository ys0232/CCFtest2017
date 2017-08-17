package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/16.
 */
public class SuperReducedString {
    static String super_reduced_string(String s) {
        boolean flag = true;
        while (s != "" && flag) {
            flag=false;
            String temp = "";
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    temp += s.charAt(i);
                } else {
                    i++;
                    flag = true;
                }
            }
            System.out.println(temp);
            if (temp.length()>0 && (temp.charAt(temp.length()-1) != s.charAt(s.length()- 1)))
          temp += s.charAt(s.length() - 1);
           // System.out.println(temp);
            s = temp;
            System.out.println(s);
        }
        if (s == "") {
            s = "Empty String";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
