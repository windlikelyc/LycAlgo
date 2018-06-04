package LycAlgo.leftGod.cha_02;

import LycAlgo.leftGod.cha_02.util.LList;

// 约瑟夫环问题
public class JosepushsKill {
  public Node josphuskill(Node head, int m) {
    if (head == null || head.next == head || m < 1) {
      return head;
    }
    Node last = head;
    while (last.next != head) {
      last = last.next;
    }
    int count = 0;
    while (head != last) {
      if (++count == m) {
        last.next = head.next;
        count = 0;
      }else {
        last = last.next;
      }
      head = last.next;
    }
    return head;
  }

  public Node josephsKill2(Node head,int m) {
    if (head == null || head.next == head || m < 1) {
      return head;
    }
    Node cur = head.next;
    int tmp = 1; // tmp: list.size
    while (cur != head) {
      tmp++;
      cur = cur.next;
    }
    tmp = getLive(tmp, m);
    while (--tmp != 0) {
      head = head.next;
    }
    head.next = head;
    return head;
  }

  private int getLive(int i, int m) {
    if (i == 1) {
      return 1;
    }
    return (getLive(i - 1, m) + m - 1) % i + 1;
  }

  public static void main(String[] args) {

    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;

    new JosepushsKill().josephsKill2(
        head,3
    );
  }



}
