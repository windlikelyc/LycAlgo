package LycAlgo.Problems.LinkedListCycle2;

import LycAlgo.utils.ListModule.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        ListNode now = head;
        while (now != null) {
            if (!set.contains(now)) {
                set.add(now);
                now = now.next;
            }else {
                return now;
            }
        }

        return null;

    }
}
