package LycAlgo.Problems.ReorederList;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;

public class Solution {
    public ListNode reorderList(ListNode head) {

        ListNode biggeest,smallest,now;
        now = head;
        while (now.next != null) {
            now = now.next;
        }
        biggeest = head;
        smallest = now;

        while (biggeest.next != smallest && biggeest!=smallest) {
            ListNode canying = biggeest;
            biggeest = biggeest.next;
            canying.next = smallest;
            smallest.next = biggeest;
            now = biggeest;
            while (now.next != smallest) {
                now = now.next;
            }
            smallest = now;

        }
        if(biggeest.next != smallest){
            biggeest.next = null;
        }else{
            smallest.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l = new List(new int[]{0}).getRoot();


        l = solution.reorderList(l);
        l.show();
    }
}
