package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class List {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int before=sc.nextInt();
        int count=1;
        for (int i=1;i<n;i++){
            int t=sc.nextInt();
            if (t!=before){
                count++;
            }
            before=t;
        }
        System.out.println(count);
    }
}
