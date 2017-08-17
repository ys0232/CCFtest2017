package hackerrank.Algorithms;

import com.sun.javafx.image.IntPixelGetter;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class Pangrams {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> count=new HashMap<>();
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='a' && s.charAt(i)<='z')
            count.put(s.charAt(i),1);
           // System.out.println(s+" "+count.size()+" "+count);
            if (count.size()==26){
                break;
            }
        }
        if (count.size()==26){
            System.out.println("pangram");
        }else System.out.println("not pangram");
    }
}
