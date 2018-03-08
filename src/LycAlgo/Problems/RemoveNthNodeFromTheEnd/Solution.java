package LycAlgo.Problems.RemoveNthNodeFromTheEnd;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pre,later ;
        pre  = later = head;

        while(later!=null && n>0){
            later = later.next;
            n--;
        }

        if(n>0 ) return head;
        if (later == null) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
            }
            return head;
        }

        while (later.next!=null){
            pre= pre.next;
            later = later.next;
        }

        pre.next= pre.next.next;

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l = new List(new int[]{1,2}).getRoot();
               l =  solution.removeNthFromEnd(l, 1);
               l.show();
    }

}
