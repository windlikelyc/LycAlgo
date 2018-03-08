package LycAlgo.utils.ListModule;


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

    public ListNode getRoot(){
        return root;
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

}
