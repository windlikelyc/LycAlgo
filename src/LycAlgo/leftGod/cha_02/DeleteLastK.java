package LycAlgo.leftGod.cha_02;


import LycAlgo.leftGod.cha_02.util.LDouList;
import LycAlgo.leftGod.cha_02.util.LList;

//  分别删除单链表和多链表倒数第k个节点
public class DeleteLastK {

  public DoubleNode removeLastKthNode(DoubleNode head, int k) {
    if (k < 1) {
      return head;
    }
    DoubleNode cur = head;
    while (cur != null) {
      k--;
      cur = cur.next;
    }
    if (k > 0) {
      return head;
    } else if (k == 0) {
      DoubleNode nHead = head.next;
      nHead.last.next = null;
      nHead.last = null;
      return nHead;
    } else {

      cur = head;

      while (++k != 0) {
        cur = cur.next;
      }
      DoubleNode toBeRemoved = cur.next;
      cur.next = toBeRemoved.next;
      toBeRemoved.last = null;
      cur.next.last = cur;
      toBeRemoved.last = null;

    }
    return head;
  }


  public Node removeLastKthNode(Node head, int k) {
    if (k < 1) {
      return head;
    }
    Node cur = head;
    while (cur != null) {
      k--;
      cur = cur.next;
    }
    if (k > 0) {
      return head;
    } else if (k == 0) {
      return head.next;
    } else {

      cur = head;

      while (++k != 0) {
        cur = cur.next;
      }
      Node toBeRemoved = cur.next;
      cur.next = toBeRemoved.next;
      toBeRemoved.next = null;
    }
    return head;
  }


  public static void main(String[] args) {
    DoubleNode d = new DeleteLastK().removeLastKthNode
        (new LDouList(new int[]{1,2,3}).getHead(), 2);

    return;


  }



}
