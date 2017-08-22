package problemsOfCCF;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/21.
 */
public class DateOfNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int d = sc.nextInt();
        boolean flag = false;
        if (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0) {
            flag = true;
        }
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (flag) {
            month[1] += 1;
        }
        int m = 0;
        for (int i = 0; i < month.length; i++) {
            if (d < month[i]) {
                m = i + 1;
                break;
            } else d -= month[i];
            System.out.println(d);
        }
        System.out.println(year + "年" + m + "月" + d + "日");

    }
}
