package LycAlgo.utils.ListModule;

/**
 * Created by lyc on 2017/9/1.
 */
public class ListTest {
    public static void main(String[]args){

        ListNode l = ListNode.create(new int[]{3, 4, 5, 6});

        ListNode t = ListNode.sawp(l, 3, 7);
        t.show();



    }


}
