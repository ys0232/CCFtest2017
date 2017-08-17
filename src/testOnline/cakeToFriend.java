package testOnline;

import java.util.Scanner;

public class cakeToFriend{
    public static void main(String[] args){

       // int num=1000;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        for (int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }
        sc.close();
        int i=0;
        while (i<n){

            count++;
            System.out.println("count: "+count);
            int sum=0;
            while(sum<k && i<n){
               // System.out.println("sum: "+sum);
                sum+=a[i];
                i++;
            }
        }
        System.out.println(count);
    }
}
