package hackerrank.Algorithms;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/18.
 */
public class FibonacciModified {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Long t0 = sc.nextLong();
        Long t1 = sc.nextLong();
        int n = sc.nextInt();
        String[] f = new String[n];
        f[0] = String.valueOf(t0 + t1 * t1);
        Long t = Long.valueOf(f[0]);
        f[1] = String.valueOf(t1 + t * t);
        for (int i = 2; i < n - 2; i++) {
            BigInteger a=new BigInteger(f[i-1]);
           BigInteger b=new BigInteger(f[i-2]);
            String result=a.multiply(a).toString();
            //System.out.println(result);
                f[i]=new BigInteger(result).add(b).toString();
        }

      System.out.println(f[n - 3]);


    }

    static String oparetion(String t1, String t2, String t3) {
        String result = "";
        int len1 = t1.length();
        int len2 = t2.length();
        int[] t = new int[len1];
        int[] s = new int[len2];
        for (int i = 0; i < len1; i++) {
            t[len1 - 1 - i] = t1.charAt(i) - '0';
        }
        for (int i = 0; i < len2; i++) {
            s[len2 - 1 - i] = t2.charAt(i) - '0';
        }
        //System.out.println(t1+" "+ Arrays.toString(t)+" "+t3);
        int[] r = new int[len1 + len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                r[i + j] += t[i] * s[j];
            }
        }
        for (int i = 0; i < len1 + len2; i++) {
            if (r[i] > 10) {
                r[i + 1] += r[i] / 10;
                r[i] = r[i] % 10;
            }
        }
        boolean flag = false;
        for (int i = len1 + len2 - 1; i >= 0; i--) {
            if (r[i] != 0) {
                flag = true;
            }
            if (flag)
                result += r[i];
        }
        String str = "";
        int m = 0;
        if (result.length()<t3.length()){
            String TEM=result;
            result=t3;
            t3=TEM;
        }
        int len = result.length();
        for (int i = len - 1; i >= 0; i--) {
            int x = result.charAt(i) - '0';
            int y = 0;
            if (i > len - t3.length()-1)
                y = t3.charAt(i-len+t3.length()) - '0';
            int temp = x + y + m;
            str += temp % 10;
            m = temp / 10;
          //  System.out.println(str+" "+temp+" "+result+" "+x+" "+t3+" "+y);
        }
        while (m > 0) {
            str += m % 10;
            m = m / 10;
        }
        result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        //System.out.println(result+" "+str);
        //result = str;
        return result;
    }
    static String Multiply(String t,String s){
        String result="";

        return result;
    }
    static String add(String t,String s){
        String result="";
        String str="";
        int m = 0;
        if (t.length()<s.length()){
            String TEM=t;
            t=s;
            s=TEM;
        }
        int len = t.length();
        //System.out.println(s+" "+t);
        for (int i = len - 1; i >=0; i--) {
            int x = t.charAt(i) - '0';
            int y=0 ;
            if (i>len-s.length()-1)
                y =s.charAt(i-len+s.length()) - '0';
            int temp = x + y + m;
            str += temp % 10;
            m = temp / 10;
            // System.out.println(str+" "+temp+" "+t+" "+x+" "+s+" "+y);
        }
        while (m > 0) {
            str += m % 10;
            m = m / 10;
        }
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        //  result = str;
       // System.out.println(result);
        return result;
    }
}
