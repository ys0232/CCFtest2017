package testOnline;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarkDownNewOne {
    static String transfer(String s1) {
        String s = "";
      //  System.out.println(s1);
        String[] strs ;
        strs = s1.replace("\n"," ").split(" ");
        //System.out.println(s1.replace("\n"," "));
        char t = strs[0].charAt(0);
        if (t == '#') {
            s += "<h" + strs[0].length() + ">";
            for (int i = 1; i < strs.length; i++) {
                if (strs[i] != "\n")
                    s += strs[i];
            }
            s += "</h" + strs[0].length() + ">";
        } else if (t == '*') {
            strs = s1.replace("\n"," ").split(" ");
            s += "<ul>\n<li>";
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].equals("*")) {
                    s += strs[i];
                } else s += "</li>\n<li>";
            }
            s += "</li>\n</ul>";
        } else if (t >= 'A' && t <= 'Z') {
            s += "<p>";
            for (int i = 0; i < strs.length; i++) {
                String regex = "(?<=\\[)(\\S+)(?=\\])";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(strs[i]);
                String text1 = "";
                if (matcher.find()) {
                    text1 = matcher.group();
                    //  System.out.println(text1+"  "+strs[i]);
                    Pattern pat = Pattern.compile("(?<=\\()(\\S+)(?=\\))");
                    Matcher mat = pat.matcher(strs[i]);
                    String text2 = "";
                    if (mat.find()) {
                        text2 = mat.group();
                        //   System.out.println(text2);
                    }
                    String temp="";
                    int len=text1.length()+text2.length();
                    if (strs[i].length()-len>4){
                        temp=strs[i].substring(len+4).trim();
                    }
                    strs[i] = "<a href=\"" + text2 + "\">" + text1 + "</a>"+temp;
                }
                regex = "(?<=\\_)(\\S+)(?=\\_)";
                pattern = Pattern.compile(regex);
                matcher = pattern.matcher(strs[i]);
                if (matcher.find()) {
                    String text = matcher.group();
                    //  System.out.println(text);
                    String temp="";
                    if (strs[i].length()-text.length()>2){
                        temp=strs[i].substring(text.length()+2).trim();
                    }
                    strs[i] = "<em>" + text + "</em>"+temp;
                }
                if (s.length()>0){
                    s+=" "+strs[i];
                }else  s += strs[i];
            }
            s += "</p>";
        }
        return s;
    }

    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        int k = 0;
        while (sc.hasNext()) {
            String t = sc.nextLine();
            if (t.equals("EOF")) {
                break;
            }
            if (t.length() > 0) {
                str += t + "\n";
            } else {
                //System.out.println(str);
                s.add(k, str);
                str = "";
                k++;
            }
            //  System.out.println(str);
        }
        for (int i = 0; i < s.size(); i++) {
            String s1 = s.get(i);
            System.out.println(transfer(s1) + "\n");
        }

    }
}
