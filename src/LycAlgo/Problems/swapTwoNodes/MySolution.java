package LycAlgo.Problems.swapTwoNodes;

import LycAlgo.utils.ListModule.ListNode;

/**
 * Created by lyc on 2017/9/4.
 */
public class MySolution {
    public ListNode swapNodes(ListNode head, int v1, int v2) {

        //基本模仿答案写的代码
        // 这次就算了，下次先自己g再看答案

        ListNode l1 = head;
        ListNode l2 = head;
        ListNode pre1 = null;
        ListNode pre2 = null;

        //没做短路处理，引用之前先判空
        while (l1.val != v1 && l1 != null) {
            pre1 = l1;
            l1 = l1.next;
        }
        //同上
        while (l2.val != v2 && l2 != null) {
            pre2 = l2;
            l2 = l2.next;
        }

        //万一没找到怎么办，没容错

        if (pre1 != null) {
            pre1.next = l2;
        } else {
            head = l2;
        }

        if (pre2 != null) {
            pre2.next = l1;
        } else {
            head = l1;
        }

        ListNode tmp = l1;
        l1.next = l2.next;
        l2.next = tmp.next;


        return head;


    }
}
