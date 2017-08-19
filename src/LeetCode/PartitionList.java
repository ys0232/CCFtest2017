package LeetCode;

/**
 * Created by lenovo on 2017/8/19.
 */
public class PartitionList {
    static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode r = head;
        ListNode be = r;
        ListNode end = head;
        boolean flag = false;
        boolean f=false;
        while (r.next != null) {
            if (r.val>=x){
                f=true;
            }
            if (r.val < x && f) {
                flag = true;
                break;
            }
            be = r;
            r = r.next;
        }
        if (r.val<x && r.next==null && f){
            r.next=head;
            be.next=null;
            head=r;
        }
        if (flag) {
            be.next = r.next;
            r.next = head;
            head = r;
        } else {
            return head;
        }
        ListNode fe = head;
        while (fe.next != null) {
            System.out.print(fe.val + "->");
            fe = fe.next;
        }
        System.out.println(fe.val);

        while (end.next != null) {
            end = end.next;
        }

        ListNode breakNode = end;
        flag = true;
        while (r.next != null && flag) {
            if (r.val >= x) {
                ListNode t = new ListNode(r.val);
                t.next = null;
                end.next = t;
                end = end.next;
                be.next = r.next;
            } else {
                be = r;
            }
            ListNode fore = head;
            while (fore.next != null) {
                System.out.print(fore.val + "->");
                fore = fore.next;
            }
            System.out.println(fore.val);
            r = r.next;
            if (r == breakNode) {
                flag = false;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        String[] s = "1 2".split(" ");
        int x = 3;
        ListNode head = new ListNode(Integer.valueOf(s[0]));
        head.next = null;
        ListNode r = head;
        for (int i = 1; i < s.length; i++) {
            ListNode t = new ListNode(Integer.valueOf(s[i]));
            t.next = null;
            r.next = t;
            r = r.next;
        }
        r = head;
        while (r.next != null) {
            System.out.print(r.val + "->");
            r = r.next;
        }
        System.out.println(r.val
                + "\n******************************************************");
        r = partition(head, x);
        while (r.next != null) {
            System.out.print(r.val + "->");
            r = r.next;
        }
        System.out.println(r.val);
    }

}
