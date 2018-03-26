package algorithm.Problems.swapTwoNodes;

import algorithm.utils.ListModule.ListNode;

/**
 * Created by lyc on 2017/9/4.
 */
public class Solution {
    /* Function to swap ListNodes x and y in linked list by
   changing links */
    public void swapListNodes(ListNode head, int x, int y) {
        // Nothing to do if x and y are same
        if (x == y) return;

        // Search for x (keep track of prevX and CurrX)
        ListNode prevX = null, currX = head;
        while (currX != null && currX.val != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Search for y (keep track of prevY and currY)
        ListNode prevY = null, currY = head;
        while (currY != null && currY.val != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        // Swap next pointers
        ListNode temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
}
