package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/17.
 */
public class IntrotoTutorialChallenges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int index=-1;
        for (int i = 0; i < n; i++) {
            index++;
            a[i] = sc.nextInt();
            if (a[i]==k){
                break;
            }
        }
        System.out.println(index);

    }
}
