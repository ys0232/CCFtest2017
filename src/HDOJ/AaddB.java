package HDOJ;


import java.util.Map;
import java.util.Scanner;

public class AaddB {
    static String add(String t, String s) {
        String result = "";
        String str = "";
        int m = 0;
        if (t.length() < s.length()) {
            String TEM = t;
            t = s;
            s = TEM;
        }
        int len = t.length();
        //System.out.println(s+" "+t);
        for (int i = len - 1; i >= 0; i--) {
            int x = t.charAt(i) - '0';
            int y = 0;
            if (i > len - s.length() - 1)
                y = s.charAt(i - len + s.length()) - '0';
            int temp = x + y + m;
            str += temp % 10;
            m = temp / 10;
            // System.out.println(str+" "+temp+" "+t+" "+x+" "+s+" "+y);
        }
        while (m > 0) {
            str += m % 10;
            m = m / 10;
        }
        boolean flag=false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i)!='0'){
                flag=true;
            }
            if (flag)
            result += str.charAt(i);
        }
        //  result = str;
        // System.out.println(result);
        return result;
    }

    static String sub(String t, String s) {
        String result = "";
        String str="";
        int len = t.length();
        int sub = 0;
        for (int i = len - 1; i >= 0; i--) {
            int t1 = t.charAt(i) - '0';
            int s1 = 0;
            if (i > len - s.length() - 1) {
                s1 = s.charAt(i-len+s.length()) - '0';
            }
            int temp = t1 - s1 + sub;
            if (temp < 0) {
                sub = -1;
                temp+=10;
            }
            str+=temp;
        }
        boolean flag=false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i)!='0')
                flag=true;
            if (flag)
            result += str.charAt(i);
        }
        if (result==""){
            result="0";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.charAt(0) != '-' && s2.charAt(0) != '-') {
                System.out.println(add(s1, s2));
            } else if (s1.charAt(0) == '-' && s2.charAt(0) == '-') {
                String str1 = s1.substring(1);
                String str2 = s2.substring(1);
                System.out.println("-" + add(str1, str2));
            } else if (s1.charAt(0) == '-') {
                String str1 = s1.substring(1);
                if (str1.length() > s2.length() ||
                        (str1.length()==s2.length() && str1.compareTo(s2)>0)) {
                    System.out.println("-" + sub(str1, s2));
                } else {
                    System.out.println(sub(s2, str1));
                }
            }else {
                String str2 = s2.substring(1);
                if (str2.length() > s1.length() ||
                        (str2.length()==s1.length() && str2.compareTo(s1)>0)) {
                    System.out.println("-" + sub(str2, s1));
                } else {
                    System.out.println(sub(s1, str2));
                }
            }
        }
    }
}
