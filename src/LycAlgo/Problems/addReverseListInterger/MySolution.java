package theKeepGoingLeetcode.Problems.addReverseListInterger;

import org.junit.*;
import org.junit.Test;
import theKeepGoingLeetcode.utils.ListModule.ListNode;

import java.util.List;

/**
 * Created by lyc on 2017/9/1.
 */

/**
 *  l1 2-4-3
 *  l2 5-6-4
 *
 *  ans 7-0-8
 */

/**
 * 没有考虑到l1 != l2  的情况
 * 没有考虑到 500+500 的情况
 */
public class MySolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //注意style
        ListNode r1 = l1;
        ListNode r2 = l2;
        //head node
        //别起ra这种让人confused的名字
        ListNode ra = new ListNode(0);
        ListNode tail  = ra;
        //c???
        /**
         * 这里没必要使用status desing patten 吧。。。
         */

        boolean c = false;

        //r2怎么办
        while( r1!=null){

            //还是r2为空的问题。没判空就直接使用
            if(!c){
                tail.next = new ListNode((r1.val + r2.val) % 10);
            }else {
                tail.next = new ListNode((r1.val + r2.val + 1) % 10);
            }
            //check sign
            if(r1.val + r2.val >= 10){
                c = true;
            }else {
                c = false;
            }
            //move tail
            tail = tail.next;

            //move l1l2
            r1 = r1.next;
            r2 = r2.next;
        }
        return ra.next;
    }
    @Test
    public void test(){
        ListNode l1 = ListNode.create(new int[]{0,0,5});
        ListNode l2 = ListNode.create(new int[]{0,2});
        ListNode l3 = addTwoNumbers(l1, l2);
        l3.show();

    }
}
