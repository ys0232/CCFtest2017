package problemsOfCCF;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/21.
 */
public class NumberOfList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int be=sc.nextInt();
        for (int i=0;i<n-1;i++){
            if (be!=sc.nextInt()){
                count++;
            }
        }
        System.out.println(count);
    }
}
