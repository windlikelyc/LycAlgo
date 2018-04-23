package LycAlgo.leftGod.cha_02;

import LycAlgo.leftGod.cha_02.util.LDouList;

public class ReverseList {

  public DoubleNode reverseList(DoubleNode head) {
    DoubleNode pre = null;
    DoubleNode next = null;
    while (head != null) {
      next = head.next;
      head.next = pre;
      head.last = next;
      pre = head;
      head = next;
    }
    return pre;
  }

  public Node reverseList(Node head) {
    Node pre = null;
    Node next = null;
    while (head != null) {
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }

  public static void main(String[] args) {
    new ReverseList().reverseList(
        new LDouList(new int[]{
        1, 2, 3, 4
    }).getHead()
    );
  }

}
