package testOnline;


import java.util.Scanner;
class Arg{
    boolean hasPar;
    boolean isAppear;
}
/**
 * Created by lenovo on 2017/9/9.
 */
public class commandLineAns {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Arg[] argues=new Arg[26];
        for (int i=0;i<argues.length;i++){
            argues[i]=new Arg();
        }
        char[] rule=sc.nextLine().toCharArray();
        for (int i=0;i<rule.length;i++){
            if (rule[i]==':'){
                argues[rule[i-1]-'a'].hasPar=true;
            }else argues[rule[i]-'a'].isAppear=true;
        }

        int n=Integer.parseInt(sc.nextLine());
        StringBuilder[] result=new StringBuilder[n];
        for (int i=0;i<n;i++){
            result[i]=new StringBuilder("Case"+(i+1)+": ");
            boolean[] isAppear=new boolean[26];
            String[] parameter=new String[26];

            String[] in=sc.nextLine().split(" ");
            for (int j=1;j<in.length;){
                if (((in[j].length()!=2 || in[j].charAt(0)!='-')
                        || (in[j].charAt(1)-'a'<0 ||in[j].charAt(1)-'a'>25))
                    ||(!argues[in[j].charAt(1)-'a'].isAppear)){
                    break;
                }
                char c=in[j].charAt(1);
                if (argues[c-'a'].hasPar && j<in.length-1){
                    isAppear[c-'a']=true;
                    parameter[c-'a']=in[j+1];
                    j+=2;
                }else {
                    isAppear[c-'a']=true;
                    j++;
                }
            }
            for (int j=0;j<26;j++){
                if (isAppear[j]){
                    char temp=(char)('a'+j);
                    result[i].append("-"+temp+" ");
                    if (argues[j].hasPar){
                        result[i].append(parameter[j]+" ");
                    }
                }
            }
        }
            sc.close();
            for (int i=0;i<n;i++){
        System.out.println(result[i].toString().trim());
            }
    }
}
