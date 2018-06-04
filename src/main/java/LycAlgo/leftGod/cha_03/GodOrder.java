package LycAlgo.leftGod.cha_03;

/**
 * 用On的时间O1的空间遍历二叉树
 */
public class GodOrder {

  // morris 中序遍历
  public void morrisIn(Node head) {
    if (head == null) {
      return;
    }
    Node cur1 = head;
    Node cur2 = null;
    while (cur1 != null) {
      cur2 = cur1.left;
      if (cur2 != null) {
        while (cur2.right != null && cur2.right != cur1) {
          cur2 = cur2.right;
        }
        if (cur2.right == null) {
          cur2.right = cur1;  // cur1的左子树的最右节点的right指向cur1
          cur1 = cur1.left;
          continue;
        } else {
          cur2.right = null; // 还原之前的节点
        }

      }
      System.out.print(cur1.value + " ");
      cur1 = cur1.right;
    }
    System.out.println();
  }

  // 先序遍历,即中序遍历的简单改写
  public void morrisPre(Node head) {
    if (head == null) {
      return;
    }
    Node cur1 = head;
    Node cur2 = null;
    while (cur1 != null) {
      cur2 = cur1.left;
      if (cur2 != null) {
        while (cur2.right != null && cur2.right != cur1) {
          cur2 = cur2.right;
        }
        if (cur2.right == null) {
          cur2.right = cur1;
          System.out.print(cur1.value + " ");
          cur1 = cur1.left;
          continue;
        } else {
          cur2.right = null;
        }
      }else {
        System.out.print(cur1.value + " ");
      }
      cur1 = cur1.right;
    }
    System.out.println();

  }


  public static void main(String[] args) {
    new GodOrder().morrisPre(TreeFactory.getTree3());


  }

}
