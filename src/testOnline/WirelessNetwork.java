package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/10.
 */
class nodeInWireless{
    long x,y;
    int step;
}

public class WirelessNetwork {
    static int bfs(int n,int begin,int end,long r){
return 0;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long r=sc.nextLong();
        long[] x=new long[n+m];
        long[] y=new long[n+m];
        for (int i=0;i<n+m;i++){
            x[i]=sc.nextLong();
            y[i]=sc.nextLong();
        }
        int ans=bfs(n+m,0,1,r);
        System.out.println(ans);

    }
}
