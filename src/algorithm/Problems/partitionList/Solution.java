package algorithm.Problems.partitionList;

import algorithm.utils.ListModule.ListNode;

public class Solution {
  public ListNode partition(ListNode head, int x) {
    if(head == null || head.next == null){
      return head;
    }
    int length = 1;
    ListNode l = head;
    // 获得链表的长度
    while (l.next != null) {
      length++;
      l = l.next;
    }
    ListNode fakeHead = new ListNode(-1);
    fakeHead.next = head;
    ListNode pre = fakeHead;
    ListNode now = head;

    for(int i= 0 ; i < length ; i++) {
      if(now.val < x ){
        pre = pre.next;
        now = now.next;
      }else {
        ListNode tmp = now;
        if(!(tmp == l)){
        pre.next = now.next;
          now = now.next;
          tmp.next = null;
          l.next = tmp;
          l = l.next;
        }
      }
    }
    return fakeHead.next;
  }

}
