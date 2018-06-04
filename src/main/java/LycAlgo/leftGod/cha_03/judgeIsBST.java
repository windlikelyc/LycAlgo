package LycAlgo.leftGod.cha_03;

public class judgeIsBST {

  public boolean isBanlance(Node head) {
    boolean[] res = new boolean[1];
    res[0] = true;
    getHeight(head, 1, res);
    return res[0];

  }

  private int getHeight(Node head, int level, boolean[] res) {

    if (head == null) {
      return level;
    }
    int lH = getHeight(head.left, level + 1, res);
    if(!res[0]){
      return level;
    }
    int rH = getHeight(head.right, level + 1, res);
    if (!res[0]) {
      return level;
    }

    if (Math.abs(lH - rH) > 1) {
      res[0] = false;
    }
    return Math.max(lH, rH);
  }

  public static void main(String[] args) {
    new judgeIsBST().isBanlance(TreeFactory.getTree1());
  }
}
