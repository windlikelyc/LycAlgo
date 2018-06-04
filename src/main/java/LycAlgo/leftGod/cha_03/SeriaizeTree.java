package LycAlgo.leftGod.cha_03;

import testDesignPattern.desiginBuddhism.proxy.XimenQing;

import java.util.LinkedList;
import java.util.Queue;

public class SeriaizeTree {
  public String serialByPre(Node head){
    if (head == null) {
      return "#!";
    }
    String res = head.value + "!";
    res += serialByPre(head.left);
    res += serialByPre(head.right);
    return res;
  }

  public Node reconByPreString(String preStr) {
    String[] values = preStr.split("!");
    Queue<String> queue = new LinkedList<String>();
    for (int i = 0; i != values.length; i++) {
      queue.offer(values[i]);
    }
    return reconPreOrder(queue);
  }

  public Node reconPreOrder(Queue<String> queue) {
    String value = queue.poll();
    if (value.equals("#")) {
      return null;
    }
    Node head = new Node(Integer.valueOf(value));
    head.left = reconPreOrder(queue);
    head.right = reconPreOrder(queue);
    return head;
  }


  // 按层次遍历二叉树
  public String serialByLevel(Node head) {
    if (head == null) {
      return "#!";
    }
    String res = head.value + "!";
    Queue<Node> queue = new LinkedList<Node>();
    queue.offer(head);
    while (!queue.isEmpty()) {
      head = queue.poll();
      if (head.left != null) {
        res += head.left.value + "!";
        queue.offer(head.left);
      }else {
        res += "#!";
      }
      if (head.right != null) {
        res += head.right.value + "!";
        queue.offer(head.right);
      }else {
        res += "#!";
      }
    }
    return res;
  }

  //反序列化按层遍历的结果
  public Node reconByLevelString(String levelStr) {
    String[] values = levelStr.split("!");
    int index = 0;
    Node head = generateNodeByString(values[index++]);
    Queue<Node> queue = new LinkedList<>();
    if (head != null) {
      queue.offer(head);
    }
    Node node = null;
    while (!queue.isEmpty()) {
      node = queue.poll();
      node.left = generateNodeByString(values[index++]);
      node.right = generateNodeByString(values[index++]);
      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
    }
    return head;
  }

  private Node generateNodeByString(String value) {
    if (value.equals("#")) {
      return null;
    }
    return new Node(Integer.valueOf(value));
  }


  public static void main(String[] args) {
    SeriaizeTree st = new SeriaizeTree();
    String a = st.serialByLevel(TreeFactory.getTree2());
    st.reconByLevelString(a);


  }
}
