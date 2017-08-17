package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/15.
 */
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = twoSum(a, target);
        System.out.println(Arrays.toString(result));
    }


}
