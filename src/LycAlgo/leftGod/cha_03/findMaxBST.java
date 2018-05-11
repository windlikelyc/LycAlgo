package LycAlgo.leftGod.cha_03;

public class findMaxBST {

  public Node biggestSubBST(Node head) {
    int[] record = new int[3];
    return posOrder(head, record);
  }

  private Node posOrder(Node head, int[] record) {
    if (head == null) {
      record[0] = 0;
      record[1] = Integer.MAX_VALUE;
      record[2] = Integer.MIN_VALUE;
      return null;
    }
    int value = head.value;
    Node left = head.left;
    Node right = head.right;
    Node lBST = posOrder(left, record);
    int lSize = record[0];
    int lMin = record[1];
    int lMax = record[2];
    Node rBST = posOrder(right, record);
    int rSize = record[0];
    int rMin = record[1];
    int rMax = record[2];
    if (left == lBST && right == rBST
        && lMax < value && value < rMin) {
      record[0] = lSize + rSize + 1;
      return head;
    }
    record[0] = Math.max(lSize, rSize);
    return lSize > rSize ? lBST : rBST;
  }

  public static void main(String[] args) {
    new findMaxBST().biggestSubBST(TreeFactory.getTree4());
  }
}
