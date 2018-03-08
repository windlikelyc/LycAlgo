package LycAlgo.Problems.PopulatingNextRight;

import LycAlgo.utils.Tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public class TreeLinkNode {
       int val;
       TreeLinkNode left, right, next;
       TreeLinkNode(int x) { val = x; }
    }
    public void connect(TreeLinkNode root) {
        if(root== null) return;
        Queue<TreeLinkNode> queue = new ArrayDeque();
        queue.add(root);

        while (!queue.isEmpty()) {
            int l = queue.size();
            TreeLinkNode prev = queue.peek();
            for(int i = 0 ; i < l ; i++) {
                TreeLinkNode t = queue.poll();
                if(i>0){
                    prev.next = t;
                    prev = prev.next;
                }

                if(t.left != null) queue.add(t.left);
                if(t.right != null) queue.add(t.right);
            }
        }
        return;
    }
}
