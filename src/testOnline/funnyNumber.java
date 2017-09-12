package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/3.
 */
public class funnyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] count=new long[8];
        count[7]=1;
        long  mod=1000000007;
      /*  for (int i=2;i<=n;i++){
            long[] newcount=new long[8];
            newcount[0]=(count[0]*2+count[1]+count[3])%mod;
            newcount[1]=(count[1]*2+count[2]+count[5])%mod;
            newcount[2]=(count[2]+count[6])%mod;
            newcount[3]=(count[3]*2+count[4]+count[5])%mod;
            newcount[4]=(count[4]+count[7])%mod;
            newcount[5]=(count[5]*2+count[6]+count[7])%mod;
            newcount[6]=0;
            newcount[7]=1;
            count=newcount;
        }*/
        long[][] status=new long[n+1][6];
        for (int i=1;i<=n;i++){
            status[i][0]=1;
            status[i][1]=(status[i-1][1]*2+status[i-1][0])%mod;
            status[i][2]=(status[i-1][2]+status[i-1][0])%mod;
            status[i][3]=(status[i-1][3]*2+status[i-1][1])%mod;
            status[i][4]=(status[i-1][4]*2+status[i-1][2]+status[i-1][1])%mod;
            status[i][5]=(status[i-1][5]*2+status[i-1][4]+status[i-1][3])%mod;
        }
        System.out.println(status[n][5]);
    }
}
