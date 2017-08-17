package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/16.
 */
public class CamelCase {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);

    }


}
