package LycAlgo.leftGod.cha_03;

public class findMaxBSTtopo {

  public int bstTopoSize1(Node head) {
    if (head == null) {
      return 0;
    }
    int max = maxTopo(head, head);
    max = Math.max(bstTopoSize1(head.left), max);
    max = Math.max(bstTopoSize1(head.right), max);
    return max;
  }

  public int maxTopo(Node h, Node n) {
    if (h != null && n != null && isBSTNode(h, n, n.value)) {
      return maxTopo(h, n.left) + maxTopo(h, n.right) + 1;
    }
    return 0;
  }

  public boolean isBSTNode(Node h, Node n, int value) {
    if (h == null) {
      return false;
    }
    if (h == n) {
      return true;
    }
    return isBSTNode(h.value > value ? h.left : h.right, n, value);

  }

  public static void main(String[] args) {
    System.out.println(new findMaxBSTtopo().bstTopoSize1(TreeFactory.getTree4()));

  }

}
