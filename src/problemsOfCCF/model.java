package problemsOfCCF;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo on 2017/8/23.
 */
public class model {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        String[]  example=new String[m];
        String string="";
        HashMap<String,String> var=new HashMap<>();
        for (int i=0;i<m;i++){
            example[i]=sc.nextLine();
        }
        for (int i=0;i<n;i++){
            string=sc.nextLine();
            String regex="\"[\\s\\S]*\"";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(string);
            while (matcher.find()){
                var.put(string.split(" ")[0],matcher.group());
            }
        }
        for (int i=0;i<m;i++){
           String  regex = "(?<=\\{\\{)(\\S+)(?=\\}\\})";
            Pattern pattern = Pattern.compile(regex);
          Matcher  matcher = pattern.matcher(example[i]);
            String t="";
          while (matcher.find()){
              t=var.get(matcher.group());
              String[] temp1=example[i].split("\\{\\{");
              String[] temp2=temp1[1].split("\\}\\}");
              temp2[0]=t;
          }
        }
    }
}
