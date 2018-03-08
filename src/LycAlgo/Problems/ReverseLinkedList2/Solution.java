package LycAlgo.Problems.ReverseLinkedList2;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummp = new ListNode(-1);
        ListNode m_pre ,pre,later,tmp;
        int count =n - m;
        m_pre = dummp;
        m_pre.next = head;
        while (m > 1) {
            m_pre = m_pre.next;
            m--;
            n--;
        }
        pre = m_pre.next;
        later = pre.next;

        while (count > 0) {
            // pre -> m
            tmp = later.next;
            later.next = pre;
            pre = later;
            later = tmp;
            count--;
        }

        m_pre.next.next = later;
        m_pre.next = pre;

        return dummp.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l = new List(new int[]{1, 2, 3, 4, 5, 6, 7}).getRoot();

        l = solution.reverseBetween(l, 1,7);
        l.show();
    }
}
