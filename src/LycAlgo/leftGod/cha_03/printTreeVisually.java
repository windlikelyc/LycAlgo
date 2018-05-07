package LycAlgo.leftGod.cha_03;

public class printTreeVisually {

  public void printTree(Node head) {
    System.out.println("Binary Tree:");
    printInOrder(head, 0, "H", 17);
    System.out.println();
  }

  private void printInOrder(Node head, int height, String to, int len) {
    if (head == null) {
      return;
    }
    printInOrder(head.right,height + 1,"v",len);
    String val = to + head.value + to;
    int lenM = val.length();
    int lenL = (len - lenM) / 2;
    int lenR = len - lenM - lenL;
    val = getSpace(lenL) + val + getSpace(lenR);
    System.out.println(getSpace(height * len) + val);
    printInOrder(head.left, height + 1, "^", len);
  }

  public String getSpace(int num) {
    String space = " ";
    StringBuffer buf = new StringBuffer("");
    for (int i = 0; i < num; i++) {
      buf.append(space);
    }
    return buf.toString();
  }

  public static void main(String[] args) {
    new printTreeVisually().printTree(TreeFactory.getTree2());

  }
}
