package LycAlgo.leftGod.cha_03;

import java.util.LinkedList;
import java.util.Queue;

public class judgeIsSearchOrCom {
  // 判断是否是二叉搜索树，中序遍历看是否递增即可

  // 判断是否是完全二叉树
  public boolean iSCBT(Node head) {
    if (head == null) {
      return true;
    }
    Queue<Node> queue = new LinkedList<>();
    boolean leaf = false;
    Node l = null;
    Node r = null;
    while (!queue.isEmpty()) {
      head = queue.poll();

      l = head.left;
      r = head.right;
      if ((leaf && (l != null || r != null) || (l == null && r != null))) {
        return false;
      }
      if (l != null) {
        queue.offer(l);
      }
      if (r != null) {
        queue.offer(r);
      } else {
        leaf = true;
      }
    }
    return true;
  }

}
