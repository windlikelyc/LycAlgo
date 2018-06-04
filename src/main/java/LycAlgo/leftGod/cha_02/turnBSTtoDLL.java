package LycAlgo.leftGod.cha_02;

import testthinkInjava._07.testInnerClass.Parcel1;

import java.util.LinkedList;
import java.util.Queue;

public class turnBSTtoDLL {

  class Node{
    public int value;
    public Node left;
    public Node right;
    public Node(int data) {
      this.value = data;
    }
  }

  public Node convert1(Node head) {
    Queue<Node> queue = new LinkedList<>();
    ibOrderToQueue(head, queue);
    head = queue.poll();
    Node pre = head;
    pre.left = null;
    Node cur = null;
    while (!queue.isEmpty()) {
      cur = queue.poll();
      pre.right = cur;
      cur.left = pre;
      pre = cur;
    }
    pre.right = null;
    return head;
  }

  private void ibOrderToQueue(Node head, Queue<Node> queue) {
    if (head == null) {
      return;
    }
    ibOrderToQueue(head.left, queue);
    queue.offer(head);
    ibOrderToQueue(head.right, queue);
  }


  public Node convert2(Node head){
    if (head == null) {
      return null;
    }
    Node last = process(head);
    head = last.right;
    last.right = null;
    return head;
  }

  public Node process(Node head) {
    if (head == null) {
      return null;
    }
    Node leftE = process(head.left);
    Node rightE = process(head.right);
    Node leftS = leftE != null ? leftE.right : null;
    Node rightS = rightE != null ? rightE.right : null;
    if (leftE != null && rightE != null) {
      leftE.right = head;
      head.left = leftE;
      head.right = rightS;
      rightS.left = head;
      rightE.right = leftS;
      return rightE;
    } else if (leftE != null) {
      leftE.right = head;
      head.left = leftE;
      head.right = leftS;
      return head;

    } else if (rightE != null) {
      head.right = rightS;
      rightS.left = head;
      rightE.right = head;
      return rightE;
    }
    else {
      head.right = head;
      return head;
    }












  }


}
