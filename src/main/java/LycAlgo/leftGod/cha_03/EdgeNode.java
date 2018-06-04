package LycAlgo.leftGod.cha_03;

public class EdgeNode {
  public void printEdge1(Node head) {
    if (head == null) {
      return;
    }
    int height = getHeight(head, 0);
    Node[][] edgeMap = new Node[height][2];
    setEdgeMap(head, 0, edgeMap);

    // 打印左边界
    for(int i = 0 ; i != edgeMap.length ;i++) {
      System.out.print(edgeMap[i][0].value + " ");
    }

    // 打印右边界
    printLeafNotInMap(head, 0, edgeMap);

    // 打印右边界但不是左边界的点
    for(int i = edgeMap.length - 1 ; i != -1 ;i--) {
      if (edgeMap[i][0] != edgeMap[i][1]) {
        System.out.print(edgeMap[i][1].value + " ");
      }
    }
    System.out.println();
  }

  private int getHeight(Node head, int l) {
    if (head == null) {
      return l;
    }
    return Math.max(getHeight(head.left, l + 1), getHeight(head.right, l + 1));
  }

  public void setEdgeMap(Node head, int l, Node[][] edgeMap) {
    if (head == null) {
      return;
    }
    // 左边已经卡死了，右边每次都会更新最右边的值
    edgeMap[l][0] = edgeMap[l][0] == null ? head : edgeMap[l][0];
    edgeMap[l][1] = head;
    setEdgeMap(head.left, l + 1, edgeMap);
    setEdgeMap(head.right, l + 1, edgeMap);
  }

  public void printLeafNotInMap(Node h, int l, Node[][] m) {
    if (h == null) {
      return;
    }
    if (h.left == null && h.right == null && h != m[l][0] && h != m[l][1]) {
      System.out.print(h.value + " ");
    }
    printLeafNotInMap(h.left, l + 1, m);
    printLeafNotInMap(h.right, l + 1, m);
  }

  public static void main(String[] args) {
    new EdgeNode().printEdge1(TreeFactory.getTree2());

  }

}
