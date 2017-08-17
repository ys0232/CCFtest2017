package testOnline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo on 2017/7/23.
 */
public class Markdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        String string = "";
        String[] strs={""};
        String s="";
        while (sc.hasNext()) {
            s+=sc.nextLine();
        }


        while (sc.hasNext()) {
            line = sc.nextLine();
            String[] str = line.trim().split(" ");
            int strlen=string.length();
            if (str[0].length() > 0) {
                if (strlen>0){
                strs = string.split("</");
                if (!str[0].equals("*") && !strs[strs.length - 1].equals("li>")) {
                    string += "</ul>";
                }}
                if (str[0].charAt(0) == '#') {
                    int hlen = str[0].length();
                    string += "<h" + hlen + ">" + line.replace("#", "").trim() + "</h" + hlen + ">\n";
                } else {
                    if (str[0].equals("*")) {

                        if (strlen==0 ||(strlen>0 && strs[strs.length - 1].equals("li>"))) {
                            if (strlen>0)
                            System.out.println(strs[strs.length - 1].equals("li>"));
                            string += "<ul>\n<li>" + line.replace("*","").trim() + "</li>\n";
                        } else {
                            string += "\n<li>" + line.replace("*","").trim() + "</li>\n";
                        }
                    } else {
                        if (strlen==0 ||(strlen>0 &&!strs[strs.length - 1].equals("p>")))
                            string += "<p>";
                        else {
                            String temp = strs[0];
                            for (int i = 1; i < strs.length - 1; i++) {
                                temp += "</" + strs[i];
                            }
                            string = temp;
                        }
                        for (int i = 0; i < str.length; i++) {
                            int len = str[i].length();
                            String regex = "(?<=\\[)(\\S+)(?=\\])";
                            Pattern pattern = Pattern.compile(regex);
                            Matcher matcher = pattern.matcher(str[i]);
                            if (matcher.find()) {
                                String text = matcher.group();
                                regex = "(?<=\\()[^\\)]+";
                                pattern = Pattern.compile(regex);
                                matcher = pattern.matcher(str[i]);
                                str[i] = "<a href=\"" + matcher.group() + "\">" + text + "</a>";
                            }
                            if (str[i].charAt(0) == '_' && str[i].charAt(len - 1) == '_') {
                                str[i] = "<em>" + str[i].replaceAll("_", "").trim() + "</em>";
                            }
                            string +=" "+ str[i];
                        }
                        string += "</p>\n";
                    }

                }
            }
            System.out.println(string);
        }

    }

    public static String markdown(String line) {
        String string = null;
        String[] str = line.trim().split(" ");
        if (str[0].length() > 0) {
            String[] strs = string.split("</");
            if (!str[0].equals("*") && strs[strs.length - 1].equals("li>")) {
                string += "</ul>";
            }
            if (str[0].charAt(0) == '#') {
                int hlen = str[0].length();
                string += "<h" + hlen + ">" + line.replace("#", "").trim() + "</h" + hlen + ">\n";
            } else {
                if (str[0].equals("*")) {
                    if (!strs[strs.length - 1].equals("li>")) {
                        string += "<ul>\n<li>" + line.trim() + "</li>\n";
                    } else {
                        string += "\n<li>" + line.trim() + "</li>\n";
                    }
                } else {
                    if (!strs[strs.length - 1].equals("p>"))
                        string += "<p>";
                    else {
                        String temp = strs[0];
                        for (int i = 1; i < strs.length - 1; i++) {
                            temp += "</" + strs[i];
                        }
                        string = temp;
                    }
                    for (int i = 0; i < str.length; i++) {
                        int len = str[i].length();
                        String regex = "(?<=\\[)(\\S+)(?=\\])";
                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(str[i]);
                        if (matcher.find()) {
                            String text = matcher.group();
                            regex = "(?<=\\()[^\\)]+";
                            pattern = Pattern.compile(regex);
                            matcher = pattern.matcher(str[i]);
                            str[i] = "<a href=\"" + matcher.group() + "\">" + text + "</a>";
                        }
                        if (str[i].charAt(0) == '_' && str[i].charAt(len - 1) == '_') {
                            str[i] = "<em>" + str[i].replaceAll("_", "").trim() + "</em>";
                        }
                        string += str[i];
                    }
                    string += "</p>\n";
                }

            }
        }
        System.out.println(string);
        return string;
    }
}
