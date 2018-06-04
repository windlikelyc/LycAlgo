package LycAlgo.leftGod.cha_02;

public class insertASCcircule {
  public Node insertNum(Node head, int num) {
    Node node = new Node(num);
    if (head == null) {
      node.next = node;
      return node;
    }
    Node pre = head;
    Node cur = head.next;

    while (cur != head) {
      if (pre.value <= num && cur.value >= num) {
        break;
      }
      pre = cur;
      cur = cur.next;
    }
    pre.next = node;
    node.next = cur;
    return head.value < num ? head : node;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;
    new insertASCcircule().insertNum(head, 2);
    return;

  }

}
