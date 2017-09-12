package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class sumOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        for (int i=0;i<str.length();i++){
            int t=Integer.valueOf(str.charAt(i)-'0');
            sum+=t;
        }
        System.out.println(sum);

    }
}
