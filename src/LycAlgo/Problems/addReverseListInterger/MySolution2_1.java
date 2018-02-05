package LycAlgo.Problems.addReverseListInterger;

/**
 * Created by lyc on 2017/9/6.
 */

import LycAlgo.utils.ListModule.ListNode;

/**
 * 刚刚在leetcode上看见一道题，刚刚好把倒序求和的思路堵死了、
 * 果然行百步者半九十
 * <p>
 * “What if you cannot modify the input lists?“
 * <p>
 * 话不多说开肛把
 */
public class MySolution2_1 {
    //首先想到蠢方法，不是每次都要从个位数加吗，循环找倒数第k个数试试

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int weishu = 1;//从个位开始，谁先没谁不加

        int sum = 0;

        ListNode n1 = ListNode.findEndKth(l1, weishu);
        ListNode n2 = ListNode.findEndKth(l2, weishu);

        ListNode virhead = new ListNode(0);
        while (n1 != null || n2 != null) {

            sum /= 10;
            if (n1 != null) {
                sum += n1.val;
            }

            if (n2 != null) {
                sum += n2.val;
            }

            ListNode tmp = new ListNode(sum % 10);

            if (virhead.next != null) {
                ListNode virnext = virhead.next;
                virhead.next = tmp;
                tmp.next = virnext;
            } else {
                virhead.next = tmp;
            }
            weishu += 1;
            n1 = ListNode.findEndKth(l1, weishu);
            n2 = ListNode.findEndKth(l2, weishu);
        }

        if (sum / 10 == 1) {
            ListNode vi = virhead.next;
            virhead.next = new ListNode(1);
            virhead.next.next = vi;
        }

        return virhead.next;

    }


}
