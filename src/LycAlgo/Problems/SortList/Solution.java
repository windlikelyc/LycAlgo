package LycAlgo.Problems.SortList;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;
import javafx.util.Pair;

import java.util.Stack;

public class Solution {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode slow, fast, pre;
        slow = fast = pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;
        return merge(sortList(head), sortList(slow));
    }

    private ListNode merge(ListNode l, ListNode h) {

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (l != null && h != null) {

            if (l.val < h.val) {
                cur.next = l;
                l = l.next;
            }else {
                cur.next = h;
                h = h.next;
            }
            cur = cur.next;
        }
        if(l != null) cur.next = l;
        if(h != null) cur.next = h;
        return dummy.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummp = new ListNode(-1);
        dummp.next = head;
        ListNode pre = dummp;
        while (head != null) {
            if (head.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
            head = head.next;
        }
        return dummp.next;
    }

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode fast, slow;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            stack.push(slow);
            slow = slow.next;

            fast = fast.next.next;
        }

        ListNode newhead = null;
        if (fast == null) { // even
             newhead = slow;
        }else { // odd
             newhead = slow.next;
        }

        while (!stack.isEmpty() && newhead != null) {
            if (stack.pop().val != newhead.val) {
                return false;
            }else {
                newhead = newhead.next;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(new List(new int[]{0, 0}).getRoot());
    }
}
