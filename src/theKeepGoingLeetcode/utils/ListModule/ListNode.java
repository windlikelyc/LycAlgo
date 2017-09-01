package theKeepGoingLeetcode.utils.ListModule;

/**
 * Created by lyc on 2017/9/1.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public void add(int x){
        this.next = new ListNode(x);
    }
    public void show(){
        ListNode l = this;
        do{
            System.out.print(l.val+"->");
            l = l.next;
        }while (l != null);
        System.out.print("空");

    }

    public static ListNode create(int[] x){

        if(x.length == 0) return null;
        ListNode now = new ListNode(x[0]);
        ListNode tail = now;
        for (int i = 1 ; i < x.length ; i++) {
            tail.add(x[i]);
            tail = tail.next;
        }
        return now;
    }

}
