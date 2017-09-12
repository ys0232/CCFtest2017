package HDOJ;

import java.util.Arrays;

public class quickSort {
    static int parititon(int[] a,int p,int r){
        int x=a[r];
     //   System.out.println("x:"+x);
        int i=p-1;
        int t;
        for (int j=p;j<r;j++){
            if (a[j]<=x){
                i++;
                 t=a[j];
                a[j]=a[i];
                a[i]=t;
            }
        }
        t=a[r];
        a[r]=a[i+1];
        a[i+1]=t;
      //  System.out.println(Arrays.toString(a));
        return i+1;
    }
    static void sort(int[] a,int p,int q){
        if (p<q) {
            int r = parititon(a, p, q);
           // System.out.println("r:"+r);
            sort(a, p, r - 1);
            sort(a, r + 1, q);
        }
    }
    public static void main(String[] args){
        int[] a={34,35,9,32,4,6,23,56,78};
        int[] b=a;
        sort(a,0,a.length-1);
       // Arrays.sort(b);
        System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b));

    }
}
