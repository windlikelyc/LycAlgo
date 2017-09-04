package LycAlgo.Problems.addReverseListInterger;

/**
 * Created by lyc on 2017/9/4.
 */


import LycAlgo.utils.ListModule.ListNode;

/**
 * 之前的list都是整数逆序，如果想正序怎么办
 * l1 3-4-2
 * l2 4-6-5
 */
public class MySolution2 {
    //集成方法
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        l1.show();
        l2.show();

        //首先想到将l1,l2 reverse
        ListNode reverse1 = ListNode.reverse(l1);
        ListNode reverse2 = ListNode.reverse(l2);

        reverse1.show();
        reverse2.show();

        Solution solution = new Solution();
        ListNode ans = ListNode.reverse(solution.addTwoNumbers(reverse1, reverse2));

        ans.show();

        return null;

    }


    @org.junit.Test
    public void test() {
        ListNode l1 = ListNode.create(new int[]{5, 0, 0});

        ListNode l2 = ListNode.create(new int[]{5, 0, 0});
        addTwoNumbers2(l1, l2);

    }


}
