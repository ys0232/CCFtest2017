package testOnline;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class ImageRotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
             a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[j][m-i-1]+" ");
            }
            System.out.println();
        }

    }
}
