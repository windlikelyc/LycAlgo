package LycAlgo.utils.ListModule;

/**
 * Created by lyc on 2017/9/1.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode create(int[] x){

        if(x.length == 0) return null;
        ListNode now = new ListNode(x[0]);
        ListNode tail = now;
        for (int i = 1 ; i < x.length ; i++) {
            tail.addtail(x[i]);
            tail = tail.next;
        }
        return now;
    }

    /**
     * 找倒数第k个jiedian
     * 待测试
     */
    public static ListNode findEndKth(ListNode head, int k) {

        ListNode pre = null;
        ListNode now = head;
        while (k-- != 0) {
            if (now != null) {
                now = now.next;
            } else {
                return null;
            }

        }
        pre = head;

        while (now != null) {
            now = now.next;
            pre = pre.next;
        }

        return pre;

    }


    /**
     * 转置整个链表
     *
     * @param l
     * @return 转置后的链表
     */
    public static ListNode reverse(ListNode l) {

        if (l == null || l.next == null) {
            return l;
        }

        ListNode pre = null;
        ListNode cur = l;

        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = pre;
            pre = temp;
        }

        return pre;
    }

    /**
     * 交换链表两个节点
     *
     * @param head 如果没找到什么都不做
     * @param x    值
     * @param y    值
     * @return 交换后的链表
     */
    public static ListNode sawp(ListNode head, int x, int y) {
        // Nothing to do if x and y are same
        if (x == y) return head;

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
            return head;

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
        return head;
    }


    /**
     * 加入一个整数到链表尾部
     *
     * @param x 待加入数
     */
    private void addtail(int x) {
        this.next = new ListNode(x);
    }

    /**
     * 打印整个链表
     */
    public void show() {
        ListNode l = this;

        while (l != null){
            System.out.print(l.val + "->");
            l = l.next;
        }
        System.out.println("空");

    }

    /**
     * 查找某一元素
     *
     * @param x 查找元素
     * @return 元素位置 如果没找到返回null
     */
    public ListNode find(int x) {
        ListNode l = this;
        while (l != null && l.val != x) {
            l = l.next;
        }

        return l;
    }




}
