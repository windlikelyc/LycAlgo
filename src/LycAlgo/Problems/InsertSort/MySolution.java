package LycAlgo.Problems.InsertSort;

import LycAlgo.utils.ListModule.ListNode;
import org.junit.Test;

/**
 * Created by lyc on 2017/9/4.
 */
public class MySolution {

    public ListNode insertionSortList(ListNode head) {

        ListNode cur = head;
        ListNode next = null;

        ListNode virtualhead = new ListNode(0);
        ListNode pre = virtualhead;

        while (cur != null) {
            next = cur.next;

            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;
            pre = virtualhead;
            cur = next;

        }

        return virtualhead.next;

    }

    @Test
    public void test() {
        ListNode l = ListNode.create(new int[]{2, 1});
        insertionSortList(l);
    }
}
