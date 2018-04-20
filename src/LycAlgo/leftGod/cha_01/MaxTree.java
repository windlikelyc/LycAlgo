package LycAlgo.leftGod.cha_01;


import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Stack;

class Node {
  public int value;
  public Node left;
  public Node right;

  public Node(int data) {
    this.value = data;
  }
}
// 已时间空间都是On的方式构建最大堆

// 1 每一个数的父节点是左边第一个比它大的数和右边第一个比它大的数中较小的那一个
// 2 如果一个数左边没有比它大的数右边也没有那么就是头节点
public class MaxTree {
  public Node getMaxTree(int[] arr) {
    Node[] nArr = new Node[arr.length];
    for (int i = 0; i != arr.length; i++) {
      nArr[i] = new Node(arr[i]);
    }

    Stack<Node> stack = new Stack<>();
    HashMap<Node, Node> lBigMap = new HashMap<>();
    HashMap<Node, Node> rBigMap = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      while (!stack.isEmpty() && stack.peek().value < arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        lBigMap.put(nArr[i], null);
      }else {
        lBigMap.put(nArr[i], stack.peek());
      }
      stack.push(nArr[i]);
    }
    stack.clear();

    for (int i = arr.length-1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek().value < arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        rBigMap.put(nArr[i], null);
      }else {
        rBigMap.put(nArr[i], stack.peek());
      }
      stack.push(nArr[i]);
    }

    Node head = null;
    for(int i =0 ; i != nArr.length ; i++) {
      Node curNode = nArr[i];
      Node left = lBigMap.get(curNode);
      Node right = rBigMap.get(curNode);
      if (left == null && right == null) {
        head = curNode;
      } else if (left == null) {
        if (right.left == null) {
          right.left = curNode;
        }else {
          right.right = curNode;
        }
      } else if (right == null) {
        if (left.left == null) {
          left.left = curNode;
        }else {
          left.right = curNode;
        }
      }else {

        Node parent = left.value < right.value ? left : right;
        if (parent.left == null) {
          parent.left = curNode;
        }else {
          parent.right = curNode;
        }
      }
    }
    return head;
  }

  public static void main(String[] args) {
    new MaxTree().getMaxTree(new int[]{1, 2, 3});
  }

}
