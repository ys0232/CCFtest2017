package regex;

import com.sun.deploy.panel.PathRenderer;

import javax.crypto.Mac;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo on 2017/8/23.
 */
public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            if (s.equals("EOF")){
                break;
            }
            String regex="(^ID)\\d*";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(s);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
