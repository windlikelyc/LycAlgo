package LycAlgo.leftGod.cha_03;

import java.util.HashMap;

/**
 * 注意路径不一定要从头节点开始
 */
public class findTargetMaxpath {

  public int getMaxLength(Node head, int sum) {
    HashMap<Integer, Integer> sumMap = new HashMap<>();
    sumMap.put(0, 0);
    return preOrder(head, sum, 0, 1, 0, sumMap);
  }

  /**
   *
   * @param head 当前节点
   * @param sum 待求和节点
   * @param preSum head到cur的累加和
   * @param level cur当前层数
   * @param maxLen
   * @param sumMap 第一次出现sum是在第几次层，key sum value level
   * @return
   */
  private int preOrder(Node head, int sum, int preSum
      , int level, int maxLen, HashMap<Integer, Integer> sumMap) {
    if (head == null) {
      return maxLen;
    }
    int curSum = preSum + head.value;
    if (!sumMap.containsKey(curSum)) {
      sumMap.put(curSum, level);
    }
    if (sumMap.containsKey(curSum - sum)) {
      maxLen = Math.max(level - sumMap.get(curSum - sum), maxLen);
    }

    maxLen = preOrder(head.left, sum, curSum, level + 1, maxLen, sumMap);
    maxLen = preOrder(head.right, sum, curSum, level + 1, maxLen, sumMap);
    if (level == sumMap.get(curSum)) {
      sumMap.remove(curSum);
    }
    return maxLen;
  }

  public static void main(String[] args) {
    System.out.println(new findTargetMaxpath().getMaxLength(TreeFactory.getTree3(), -8));

  }

}
