package LycAlgo.leftGod.cha_03;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class printZigZag {

  public void printByLevel(Node head){
    if (head == null) {
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    int level = 1;
    Node last = head;
    Node nLast = null;
    queue.offer(head);
    System.out.print("level " + (level++) + ": ");
    while (!queue.isEmpty()) {
      head = queue.poll();
      System.out.print(head.value + " ");
      if (head.left != null) {
        queue.offer(head.left);
        nLast = head.left;
      }
      if (head.right != null) {
        queue.offer(head.right);
        nLast = head.right;
      }
      if (head == last && !queue.isEmpty()) {
        System.out.print("\nlevel " + (level++) + ": ");
        last = nLast;
      }
    }
    System.out.println();
  }

  public void printByZigzag(Node head) {
    if (head == null) {
      return;
    }
    Deque<Node> dq = new LinkedList<>();
    int level = 1;
    boolean lr = true;
    Node last = head;
    Node nLast = null;
    dq.offerFirst(head);
    pringLevelAndOrientation(level++, lr);
    while (!dq.isEmpty()) {
      if (lr) {
        head = dq.pollFirst();
        if (head.left != null) {
          nLast = nLast == null ? head.left : nLast;
          dq.offerLast(head.left);
        }
        if (head.right != null) {
          nLast = nLast == null ? head.right : nLast;
          dq.offerLast(head.right);
        }
      }else {
        head = dq.pollLast();
        if (head.right != null) {
          nLast = nLast == null ? head.right : nLast;
          dq.offerFirst(head.right);
        }
        if (head.left != null) {
          nLast = nLast == null ? head.left : nLast;
          dq.offerFirst(head.left);
        }
      }
      System.out.print(head.value + " ");
      if (head == last && !dq.isEmpty()) {
        lr = !lr;
        last = nLast;
        nLast = null;
        System.out.println();
        pringLevelAndOrientation(level++, lr);
      }
    }
    System.out.println();
  }

  private void pringLevelAndOrientation(int i, boolean lr) {
    System.out.print("Level " + i + " from");
    System.out.print(lr ? " left to right :" : " right to left :");
  }

  public static void main(String[] args) {
    new printZigZag().printByZigzag(TreeFactory.getTree5());
  }


}
