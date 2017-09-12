package testOnline;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/6.
 */
public class WindowOperate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] window = new int[n][4];
      //  ArrayList<Integer> list = new ArrayList<>();
        int[][] operate = new int[m][2];
        String str;
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            while (str.length() == 0) {
                str = sc.nextLine();
            }
            String[] strs=str.trim().split(" ");
            for (int j = 0; j < strs.length; j++)
                window[i][j] = Integer.valueOf(strs[j]);
          //  list.add(n-1-i);
           // System.out.println(Arrays.toString(window[i]));
        }
        for (int i = 0; i < m; i++) {
            str = sc.nextLine();
           // System.out.println(str);
            while (str.length() == 0) {
                str = sc.nextLine();
            }
            String[] strs=str.trim().split(" ");
            for (int j = 0; j < strs.length; j++)
               operate[i][j] = Integer.valueOf(strs[j]);
         //   System.out.println(Arrays.toString(operate[i]));
        }
        boolean flag=false;
  /*      for (int i = 0; i < m; i++) {
            flag=false;
            for (int j:list){
                    if (window[j][0]<=operate[i][0] &&
                            window[j][1]<=operate[i][1] &&
                            window[j][2]>=operate[i][0] &&
                            window[j][3]>=operate[i][1]){
                        System.out.println((j+1));
                        list.remove(j);
                        list.add(0,j);
                        flag=true;
                        break;
                    }
            }
            if (!flag){
                System.out.println("IGNORED");
            }
        }*/
        int[] order=new int[n];
        for (int i=0;i<n;i++){
            order[i]=n-1-i;
        }
        for (int i=0;i<m;i++){
            flag=false;
            for (int j=0;j<n;j++){
                if (window[order[j]][0]<=operate[i][0] &&
                        window[order[j]][1]<=operate[i][1] &&
                        window[order[j]][2]>=operate[i][0] &&
                        window[order[j]][3]>=operate[i][1]){
                    System.out.println((order[j]+1));
                 int temp=order[j];
                 //   System.out.println(Arrays.toString(order));
                 for (int k=j;k>0;k--){
                     order[k]=order[k-1];
                 }
                 order[0]=temp;
                    flag=true;
                    break;
                }
            }
            if (!flag){
                System.out.println("IGNORED");
            }
        }
    }
}
