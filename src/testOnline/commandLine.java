package testOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/7.
 */
public class commandLine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String com=sc.nextLine();
        int n=sc.nextInt();
        String[] commands=new String[n];
        String temp="";
        for (int i=0;i<n;i++){
            temp=sc.nextLine();
            while (temp.length()==0){
                temp=sc.nextLine();
            }
            commands[i] =temp;
        }
        HashMap<Character,Boolean> word=new HashMap<>();
        for (int i=0;i<com.length()-1;i++){
            if (com.charAt(i+1)==':'){
                word.put(com.charAt(i),true);
                i++;
            }else word.put(com.charAt(i),false);
        }
        if (com.charAt(com.length()-1)!=':'){
            word.put(com.charAt(com.length()-1),false);
        }

        for (int i=0;i<n;i++){
            HashMap<Character,String> Line=new HashMap<>();
            ArrayList<Character> list=new ArrayList<>();
            String[] str=commands[i].split(" ");
            //System.out.println(Arrays.toString(commands)+"\n"+Arrays.toString(str));
            for (int j=1;j<str.length;j++){
               if (str[j].charAt(0)=='-'){
                   char t=str[j].charAt(1);
                   if (word.containsKey(t)){
                       if (word.get(t) && j+1<str.length){
                           if (!list.contains(t))
                           list.add(t);
                           Line.put(t,str[j+1]);
                          j++;
                       }else if (!word.get(t)){
                           if (!list.contains(t))
                               list.add(t);
                       }else break;
                   }else break;
               }else break;
               }
            System.out.print("Case "+(i+1)+": ");
               for (char t:list){
                   System.out.print("-"+t+" ");
                   if (word.get(t)){
                       System.out.print(Line.get(t)+" ");
                   }
               }
            System.out.println();
        }

    }
}
