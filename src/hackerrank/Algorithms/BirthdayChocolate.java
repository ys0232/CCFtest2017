package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/16.
 */
public class BirthdayChocolate {
    static int solve(int n, int[] s, int d, int m) {
        int result=0;
        int temp=0;
        int count=0;
        for (int i=0;i<n;i++){
            if (count<m ){
                temp+=s[i];
                count++;
            }
          //  System.out.println(temp+" "+count);
            if (count==m && temp==d){
                result+=1;
                temp-=s[i-count+1];
                count--;
            }else if (temp>d || count>=m){
                temp-=s[i-count+1];
                count--;
            }


  //  System.out.println(temp+" "+s[i]+" " +i+ " "+count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int result=solve(n,s,d,m);
        sc.close();
        System.out.println(result);

    }

}
