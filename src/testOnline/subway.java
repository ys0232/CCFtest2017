package testOnline;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class subway {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cityNums=sc.nextInt();
        int workNums=sc.nextInt();
       // HashMap<String ,String> connection=new HashMap<>();
        HashMap<String,String> days=new HashMap<>();
        while (sc.hasNext()){
            String[] str=sc.next().split(" ");
          //  connection.put(str[0],str[1]);
            days.put(str[0]+"_"+str[1],str[2]);
        }
    }
}
