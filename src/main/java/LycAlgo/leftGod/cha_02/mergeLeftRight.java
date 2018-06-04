package LycAlgo.leftGod.cha_02;

public class mergeLeftRight {
  public void relocate(Node head) {
    if (head == null || head.next == null) {
      return;
    }
    Node mid = head;
    Node right = head.next;
    while (right.next != null && right.next.next != null) {
      mid = mid.next;
      right = right.next.next;
    }
    right = mid.next;
    mid.next = null;
    mergeLR(head, right);

  }

  private void mergeLR(Node left, Node right) {
    Node next = null;
    while (left.next != null) {
      next = right.next;
      right.next = left.next;
      left.next = right;
      left = right.next;
      right = next;
    }
    left.next = right;
  }
}
