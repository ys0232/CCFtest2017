package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/10.
 */
public class MaxDiff {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int before=sc.nextInt();
        int max=0;
        for (int i=1;i<n;i++){
            int curr=sc.nextInt();
            int temp=Math.abs(curr-before);
            if (temp>max){
                max=temp;
            }
            before=curr;
            //System.out.println(before+"\t"+curr+"\t"+max);
        }
        System.out.println(max);
    }
}
