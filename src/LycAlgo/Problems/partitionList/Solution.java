package LycAlgo.Problems.partitionList;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;
import org.junit.Test;

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

  @Test
  public void test(){
//    int[] nums = new int[]{1, 4, 3, 2, 5, 2};
    int[] nums = new int[]{1, 2};
    ListNode l = new ListNode(nums[0]);
    ListNode head = l;
    for(int i = 1 ; i < nums.length ; i++) {
      l.next = new ListNode(nums[i]);
      l = l.next;
    }


    head.show();
//    partition(head, 3).show();
//    partition(head, 2).show();
    partition(head, 0).show();

  }
}
