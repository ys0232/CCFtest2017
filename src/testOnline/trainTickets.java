package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/10.
 */
public class trainTickets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] seat=new int[101];
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int min=1;
        for (int i=0;i<n;i++){
            if (a[i]==1){
             seat[min]=1;
             min++;
            }else {
                int count=0;
                int number=0;
                for (int j=min;j<101;j++){
                    if (seat[j]==0){
                     count++;
                    }else {
                        count=0;
                    }
                    if (count==a[i]){
                        number=j;
                        break;
                    }
                }
                System.out.println();
            }

        }

    }
}
