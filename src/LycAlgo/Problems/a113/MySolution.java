package LycAlgo.Problems.a113;

import LycAlgo.utils.ListModule.ListNode;

import java.util.Random;

/**
 * Created by lyc on 2017/9/18.
 */
public class MySolution {

    ListNode head = null;

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public MySolution(ListNode head) {
        //用Hash表。把整个链表想成

        this.head = head;

    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {

        Random random = new Random();
        int index = 1;
        ListNode tmp = head;
        ListNode theOnlyInMemory = head;

        while (tmp.next != null) {
            tmp = tmp.next;
            int mother = random.nextInt(++index);
//            System.out.println("mother是"+mother);
            if (mother == 0) {
                theOnlyInMemory = tmp;
            }

        }
        return theOnlyInMemory.val;
    }


}
