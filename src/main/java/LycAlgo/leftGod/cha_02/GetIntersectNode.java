package LycAlgo.leftGod.cha_02;

// 两个单链表,可能有环,也可能无环.这两个链表可能相交,也可能不相交.
// 如果相交,返回第一个节点.如果不相交,返回null
// 要求时间复杂度O(N+M),空间复杂度O(1)
public class GetIntersectNode {
  // 如何判断一个链表有没有环
  public Node getLoopNode(Node head) {
    if (head == null || head.next == null || head.next.next == null) {
      return null;
    }
    Node n1 = head.next; // n1 -> slow
    Node n2 = head.next.next; // n2 -> fast
    while (n1 != n2) {
      if (n2.next == null || n2.next.next == null) {
        return null;
      }
      n2 = n2.next.next;
      n1 = n1.next;
    }
    n2 = head;
    while (n1 != n2) {
      n1 = n1.next;
      n2 = n2.next;
    }
    return n1;
  }

  // 判断两个无环链表在哪里相交
  public Node noLoop(Node head1, Node head2) {
    if (head1 == null || head2 == null) {
      return null;
    }
    Node cur1 = head1;
    Node cur2 = head2;
    int n = 0;
    while (cur1.next != null) {
      n++;
      cur1 = cur1.next;
    }
    while (cur2.next != null) {
      n--;
      cur2 = cur2.next;
    }


    if(cur1 != cur2) return null;
    cur1 = n > 0 ? head1 : head2;
    cur2 = cur1 == head1 ? head2 : head1;
    n = Math.abs(n);
    while (n != 0) {
      n--;
      cur1 = cur1.next;
    }
    while (cur1 != cur2) {
      cur1 = cur1.next;
      cur2 = cur2.next;
    }
    return cur1;
  }

  // 判断两个有环链表是否相交
  public Node bothLoop(Node head1, Node loop1, Node head2, Node loop2) {
    Node cur1 = null;
    Node cur2 = null;
    if (loop1 == loop2) {
      cur1 = head1;
      cur2 = head2;
      int n = 0;
      while (cur1 != loop1) {
        n++;
        cur1 = cur1.next;
      }
      while (cur2 != loop2) {
        n--;
        cur2 = cur2.next;
      }
      cur1 = n > 0 ? head1 : head2;
      cur2 = cur1 == head1 ? head2 : head1;
      n = Math.abs(n);
      while (n != 0) {
        n--;
        cur1 = cur1.next;
      }
      while (cur1 != cur2) {
        cur1 = cur1.next;
        cur2 = cur2.next;
      }
      return cur1;
    }else {
      cur1 = loop1.next;
      while (cur1 != loop1) {
        if (cur1 == loop2) {
          return loop1;
        }
        cur1 = cur1.next;
      }
    }
    return null;
  }

  public Node getIntersectNode(Node head1, Node head2) {
    if (head1 == null || head2 == null) {
      return null;
    }
    Node loop1 = getLoopNode(head1);
    Node loop2 = getLoopNode(head2);
    if (loop1 != null && loop2 != null) {
      return bothLoop(head1, loop1, head2, loop2);
    }
    return null;
  }

}
