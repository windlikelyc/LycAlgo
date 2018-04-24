package LycAlgo.leftGod.cha_02;


import LycAlgo.leftGod.cha_02.util.LList;

public class ReversePart {
  // 反转部分链表,比如反转2到5
  public Node reversePart(Node head, int from, int to) {
    int len = 0;
    Node node1 = head;
    Node fPre = null;
    Node tPos = null;

    while (node1 != null) {
      len++;
      fPre = len == from - 1 ? node1 : fPre;
      tPos = len == to + 1 ? node1 : tPos;
      node1 = node1.next;
    }
    if (from > to || from < 1 || to > len) {
      return head;
    }
    node1 = fPre == null ? head : fPre.next;
    Node node2 = node1.next;
    node1.next = tPos;
    Node next = null;
    while (node2 != tPos) {
      next = node2.next;
      node2.next = node1;
      node1 = node2;
      node2 = next;
    }
    if (fPre != null) {
      fPre.next = node1;
      return head;
    }
    return node1;
  }

  public static void main(String[] args) {
    new ReversePart().reversePart(
        new LList(new int[]{1, 2, 3, 4, 5}).getHead(), 1, 4
    ).show();
  }
}

