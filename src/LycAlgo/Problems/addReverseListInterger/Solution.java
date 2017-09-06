package LycAlgo.Problems.addReverseListInterger;

import LycAlgo.utils.ListModule.ListNode;


/**
 * Created by lyc on 2017/9/1.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode current1 = l1;
        ListNode current2 = l2;

        ListNode head = new ListNode(0);
        ListNode currentHead = head;

        int sum = 0;

        while(current1 != null || current2 != null) {
            //原来使用除10判断进位
            sum /= 10;
            //开头双判，中间单判
            if(current1 != null) {

                sum += current1.val;
                current1 = current1.next;

            }

            if(current2 != null) {

                sum += current2.val;
                current2 = current2.next;

            }

            currentHead.next = new ListNode(sum % 10);
            currentHead = currentHead.next;

        }

        //用累计和的取余方式判进位
        if(sum / 10 == 1) {

            currentHead.next = new ListNode(1);

        }

        return head.next;

    }

    @org.junit.Test
    public void test(){
        ListNode l1 = ListNode.create(new int[]{9,1});
        ListNode l2 = ListNode.create(new int[]{9,1 });
        ListNode l3 = addTwoNumbers(l1, l2);
        l3.show();

    }
}
