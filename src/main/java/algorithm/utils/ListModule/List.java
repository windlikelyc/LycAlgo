package algorithm.utils.ListModule;


import java.util.ArrayList;

/**
 * Created by lyc on 2017/9/1.
 */
public class List {
    private ListNode root;
    public List(int [] init){
        if(init.length == 0) root = null;

       ListNode tail = null;

        for(int i = 0 ; i <init.length ; i++){
            if(i == 0 ){
                root = new ListNode(init[i]);
                tail = root;
            }else {
                ListNode tmp = new ListNode(init[i]);
                tail.next = tmp;
                tail = tmp;

            }
        }
    }

    public void showAll() {
        ListNode l = root;
        while (l!= null){
            System.out.print(l.val);

            if(l.next != null){
                System.out.print("->");
            }

            l = l.next;

        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList l = new ArrayList();
        ListNode pre = listNode;
        if (pre == null) {
            return l;
        }
        ListNode next = listNode.next;
        pre.next = null;
        while (next != null) {
            ListNode tmp = next.next;
            next.next = pre;
            pre = next;
            next = tmp;
        }

        while (pre != null) {
            l.add(pre.val);
            pre = pre.next;
        }
        return l;

    }

    public static void main(String[] args) {
        List list = new List(new int[]{1,2,3,4});
        System.out.println(list.printListFromTailToHead(list.root));
    }


}
