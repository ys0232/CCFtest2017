package testOnline;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/7/23.
 */
public class StudentsQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> students = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            students.put(i, i);//(位置，编号)
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            move(students, p, q);
           // System.out.println(students);
        }

        for (int i=1;i<=n;i++){
            System.out.print(students.get(i)+"\t");
        }
    }

    public static void move(HashMap<Integer, Integer> a, int p, int q) {
        int w = 0;//编号为p学生的位置
        for (int i = 1; i <= a.size(); i++) {
            if (a.get(i) == p) {
                w = i;//找到编号为p的学生位置
                break;
            }
        }
        if (q > 0) {
            for (int i = w + 1; i <= w + q; i++) {
                //从学生p的后一位开始向前移动
                int t = a.get(i);
                a.put(i - 1, t);
            }
            a.put(w + q, p);
        }
        if (q < 0) {
            for (int i = w - 1; i >= w + q; i--) {
                //从学生p的前一位开始向后移动
                int t = a.get(i);
                a.put(i + 1, t);
            }
            a.put(w + q, p);
        }
    }
}
