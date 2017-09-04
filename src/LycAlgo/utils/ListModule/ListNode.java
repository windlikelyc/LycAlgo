package theKeepGoingLeetcode.utils.ListModule;

/**
 * Created by lyc on 2017/9/1.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode create(int[] x){

        if(x.length == 0) return null;
        ListNode now = new ListNode(x[0]);
        ListNode tail = now;
        for (int i = 1 ; i < x.length ; i++) {
            tail.add(x[i]);
            tail = tail.next;
        }
        return now;
    }

    public static ListNode reverse(ListNode l) {

        if (l == null || l.next == null) {
            return l;
        }

        ListNode pre = null;
        ListNode cur = l;

        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = pre;
            pre = temp;
        }

        return pre;
    }

    public void add(int x) {
        this.next = new ListNode(x);
    }

    public void show() {
        ListNode l = this;
        do {
            System.out.print(l.val + "->");
            l = l.next;
        } while (l != null);
        System.out.println("空");

    }

}
