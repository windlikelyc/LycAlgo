package LycAlgo.Problems.CopyListwithRandomPointer;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        RandomListNode randomListNode = new RandomListNode(-1);
        solution.copyRandomList(randomListNode);
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode rn = head;
        while (rn != null) {
            RandomListNode newRn = new RandomListNode(rn.label);
            newRn.next = rn.next;
            rn.next = newRn;
            rn = newRn.next;
        }
        rn = head;
        while (rn != null && rn.next != null) {
            if (rn.random == null) {
                rn.next.random = null;
            } else {
                rn.next.random = rn.random.next;
            }
            rn = rn.next.next;
        }
        rn = head.next;
        RandomListNode newHead = rn;
        while (rn != null && rn.next != null) {
            rn.next = rn.next.next;
            rn = rn.next;
        }
        return newHead;
    }
}
