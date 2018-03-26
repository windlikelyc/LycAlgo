package algorithm.Problems.OldEvenLinkList;

import algorithm.utils.ListModule.ListNode;

/**
 * Created by lyc on 2017/9/6.
 */
public class MySolution {

    public ListNode oddEvenList(ListNode head) {
        ListNode main = new ListNode(-1);
        ListNode depu = new ListNode(-1);

        ListNode n1 = main;
        ListNode n2 = depu;


        ListNode odd = head;

        while (head != null) {


            n1.next = head;
            n1 = n1.next;


            head = head.next;

            if (head == null) {
                n2.next = null;
                break;
            }


            n2.next = head;
            n2 = n2.next;

            head = head.next;


        }

        n1.next = depu.next;
        return main.next;

    }

}
