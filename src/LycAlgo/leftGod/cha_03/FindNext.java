package LycAlgo.leftGod.cha_03;

public class FindNext {
  class Node {
    public int value;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int data) {
      this.value = data;
    }
  }

  public Node getNextNode(Node node) {
    if (node == null) {
      return node;
    }
    if (node.right != null) {
      return getLeftMost(node.right);
    }else {
      Node parent = node.parent;
      while (parent != null && parent.left != null) {
        node = parent;
        parent = node.parent;
      }
      return parent;
    }

  }

  private Node getLeftMost(Node node) {
    Node tmp = node;
    while (tmp.left != null) {
      tmp = tmp.left;
    }
    return tmp;
  }

}
