package HDOJ;

import java.awt.geom.Arc2D;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class AaddB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        String s1=sc.next();
        String s2=sc.next();
            double result;
        if (s1.length()<10 && s2.length()<10){
          result  = Double.valueOf(s1)+Double.valueOf(s2);
            System.out.println(result);
        }else
            if (s1.length()<10){
            String str=s2.substring(s2.length()-10,s2.length()-1);
                result  = Double.valueOf(s1)+Double.valueOf(str);
                String t=String.valueOf(result);
                if (t.length()>str.length()){
                    int len=t.length()-str.length();
                    str=s2.substring(s2.length()-9-len-1,s2.length()-9);

                }
            }



        }
    }
}
