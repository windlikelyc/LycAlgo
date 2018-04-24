package LycAlgo.leftGod.cha_02;

import java.util.HashMap;

public class CopyRandomList {
  // 使用HashMap
  public RNode copyListWithRand1(RNode head) {
    HashMap<RNode, RNode> map = new HashMap<>();
    RNode cur = head;
    while (cur != null) {
      map.put(cur, new RNode(cur.value));
      cur = cur.next;
    }
    cur = head;
    while (cur != null) {
      map.get(cur).next = map.get(cur.next);
      map.get(cur).rand = map.get(cur.rand);
      cur = cur.next;
    }
    return map.get(head);
  }

  public RNode copyListWithRand2(RNode head) {
    if (head == null) {
      return null;
    }
    RNode cur = head;
    RNode next = null;
    while (cur != null) {
      next = cur.next;
      cur.next = new RNode(cur.value);
      cur.next.next = next;
      cur = next;
    } // 直接复制链表

    cur = head;
    RNode curCopy = null;
    while (cur != null) {
      next = cur.next.next;
      curCopy = cur.next;
      curCopy.rand = cur.rand != null ? cur.rand.next : null;
      cur = next;
    }// 调整rand指针
    RNode res = head.next;
    cur = head;

    while (cur != null) {
      next = cur.next.next;
      curCopy = cur.next;
      cur.next = next;
      curCopy.next = next != null ? next.next : null;
      cur = next;
    }
    return res;
  }

}
