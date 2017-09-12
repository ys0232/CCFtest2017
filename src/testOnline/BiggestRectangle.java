package testOnline;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/3.
 */
public class BiggestRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] height=new int[n];
        for (int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int area=0;
        for (int i=0;i<n;i++){
            int width=1;
            int max=0;
            for (int j=i-1;j>=0;j--){
                if (height[j]>=height[i]){
                    width++;
                }else break;
            }
            for (int j=i+1;j<n;j++){
                if (height[j]>=height[i]){
                    width++;
                    }else break;
            }
            max=width*height[i];
            if (max>area){
                area=max;
            }
          //  System.out.println(height[i]+"   " +area);
        }
        System.out.println(area);
    }
}
