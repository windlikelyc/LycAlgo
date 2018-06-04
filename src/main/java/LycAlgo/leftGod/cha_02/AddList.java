package LycAlgo.leftGod.cha_02;


import LycAlgo.leftGod.cha_02.util.LList;

import java.util.Stack;

public class AddList {
  // 使用栈
  public Node addList1(Node head1, Node head2) {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    while (head1 != null) {
      s1.push(head1.value);
      head1 = head1.next;
    }

    while (head2 != null) {
      s2.push(head2.value);
      head2 = head2.next;
    }
    int ca = 0; //当前两个数相加是否有进位
    int n1 = 0;
    int n2 = 0;
    int n = 0;
    Node node = null;
    Node pre = null;
    while (!s1.isEmpty() || !s2.isEmpty()) {
      n1 = s1.isEmpty() ? 0 : s1.pop();
      n2 = s2.isEmpty() ? 0 : s2.pop();
      n = n1 + n2 + ca;

      pre = node;
      node = new Node(n % 10);
      node.next = pre;
      ca = n / 10;
    }
    if (ca == 1) {
      pre = node;
      node = new Node(1);
      node.next = pre;
    }
    return node;
  }

  // 先将两个链表逆序,然后相加,最后把结果逆序
  public Node addList2(Node head1, Node head2) {
    ReverseList reverseListUtil = new ReverseList();
    head1 = reverseListUtil.reverseList(head1);
    head2 = reverseListUtil.reverseList(head2);
    int ca = 0;
    int n1 = 0;
    int n2 = 0;
    int n = 0;
    Node c1 = head1;
    Node c2 = head2;
    Node node = null;
    Node pre = null;
    while (c1 != null || c2 != null) {
      n1 = c1 != null ? c1.value : 0;
      n2 = c2 != null ? c2.value : 0;
      n = n1 + n2 + ca;

      pre = node;
      node = new Node(n % 10);
      node.next = pre;
      ca = n / 10;

      c1 = c1 != null ? c1.next : null;
      c2 = c2 != null ? c2.next : null;
    }
    if (ca == 1) {
      pre = node;
      node = new Node(1);
      node.next = pre;
    }
    reverseListUtil.reverseList(head1);
    reverseListUtil.reverseList(head2);
    return node;
  }

  public static void main(String[] args) {
    Node n1 = new LList(new int[]{1,2,3,4,5,6}).getHead();
    Node n2 = new LList(new int[]{6,3}).getHead();
    AddList a = new AddList();
    a.addList1(n1, n2).show();
    a.addList2(n1, n2).show();

  }
}