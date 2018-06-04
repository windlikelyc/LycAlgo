package LycAlgo.leftGod.cha_03;

import testDesignPattern.designRookie.State.StartState;
import testParalle.cha03.p_r_test.P;

import java.util.Stack;

public class Ergodic {

  public void preOrderUnRecur(Node head) {
    System.out.println("pre-order: ");
    if (head != null) {
      Stack<Node> stack = new Stack<Node>();
      stack.add(head);
      while (!stack.isEmpty()) {
        head = stack.pop();
        System.out.println(head.value + " ");
        if (head.right != null) {
          stack.push(head.right);
        }
        if (head.left != null) {
          stack.push(head.left);
        }
      }
      System.out.println();
    }
  }

  public void inOrderUnRecur(Node head) {
    System.out.println("in-order");
    if (head != null) {
      Stack<Node> stack = new Stack<>();
      while (!stack.isEmpty() || head != null) {
        if (head != null) {
          stack.push(head);
          head = head.left;
        }else {
          head = stack.pop();
          System.out.println(head.value + " ");
          head = head.right;
        }
      }
    }
  }

  public void postOrderUnRecur1(Node head) {
    System.out.println("pos-order: ");
    if (head != null) {
      Stack<Node> s1 = new Stack<>();
      Stack<Node> s2 = new Stack<>();
      s1.push(head);
      while (!s1.isEmpty()) {
        head = s1.pop();
        s2.push(head);
        if (head.left != null) {
          s1.push(head.left);
        }
        if (head.right != null) {
          s1.push(head.right);
        }
        while (!s2.isEmpty()) {
          System.out.println(s2.pop().value + " ");
        }
      }
    }
  }

  public void posOrderUnRecur2(Node head) {
    System.out.println("pos-order : ");
    if (head != null) {
      Stack<Node> stack = new Stack<>();
      stack.push(head);
      Node c = null;
      while (!stack.isEmpty()) {
        c = stack.peek();
        if (c.left != null && head != c.left && head != c.right) {
          stack.push(c.left);
        } else if (c.right != null && head != c.right) {
          stack.push(c.right);
        }else {
          System.out.println(stack.pop().value + " ");
          head = c;
        }


      }
    }
  }


}
