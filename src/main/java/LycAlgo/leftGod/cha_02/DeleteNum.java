package LycAlgo.leftGod.cha_02;

import LycAlgo.leftGod.cha_02.util.LList;

import java.util.Stack;

//  将值为num的节点全部删除
public class DeleteNum {

  // 将值不等于num的节点用栈收集起来，收集完成后重新连接即可
  public Node removeValue1(Node head, int num) {
    Stack<Node> stack = new Stack<>();
    while (head != null) {
      if (head.value != num) {
        stack.push(head);
      }
      head = head.next;
    }
    while (!stack.isEmpty()) {
      stack.peek().next = head;
      head = stack.pop();
    }
    return head;
  }

  //玄学删除节点
  public Node removeValue2(Node head, int num) {
    while (head != null) {
      if (head.value != num) {
        break;
      }
      head = head.next;
    }
    Node pre = head;
    Node cur = head;
    while (cur != null) {
      if (cur.value == num) {
        pre.next = cur.next;
      }else {
        pre = cur;
      }
      cur = cur.next;
    }
    return head;
  }


  public static void main(String[] args) {
    new DeleteNum().removeValue2(
        new LList(new int[]{1, 1, 2, 2, 1, 2, 3, 4, 5}).getHead(), 1
    ).show();
  }
}
