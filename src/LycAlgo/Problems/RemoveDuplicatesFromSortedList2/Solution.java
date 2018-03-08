package LycAlgo.Problems.RemoveDuplicatesFromSortedList2;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode pre,later;
        pre = later = head;
        if(later == null) return head;
        later = later.next;
        Set<Integer> set = new HashSet();
        while (later != null) {
            if (pre.val == later.val) {
                pre.next = pre.next.next;
                set.add(later.val);
                later = pre.next;
            }else {
                pre = pre.next;
                later = later.next;
            }
        }

        ListNode duzzy = new ListNode(-1);

        duzzy.next = head;
        pre =later= duzzy;
        later = later.next;


        while (later!=null) {
            if (set.contains(later.val)) {
                if (later == null) {
                    pre.next = null;
                }else {
                    pre.next = later.next;
                }
                later = later.next;
            }else {
                pre = pre.next;
                later = later.next;
            }
        }
        return duzzy.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l = new List(new int[]{1,1,2}).getRoot();
        l =  solution.deleteDuplicates(l);
        l.show();
    }
}
