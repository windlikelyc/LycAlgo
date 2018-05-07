package LycAlgo.leftGod.cha_03;

public class TreeFactory {
  // 生产几个常见的树

  /**            1
   *           /  \
   *          2    3
   *        /  \  / \
   *       4   5 6   7
   */
  public static  Node getTree1(){

    Node head = new Node(1);

    head.left = new Node(2);
    head.right = new Node(3);

    head.left.left = new Node(4);
    head.left.right = new Node(5);
    head.right.left = new Node(6);
    head.right.right = new Node(7);
    return head;
  }

  /**                          1
   *                        /      \
   *                     /           \
   *                  /                \
   *                2                    3
   *                   \                /  \
   *                   4              5      6
   *                 /   \          /  \
   *               7     8         9   10
   *                     \        /
   *                     11     12
   *                    / \    /  \
   *                  13  14  15    16
   */

  public static Node getTree2(){
    Node head = new Node(1);

    head.left = new Node(2);
    head.right = new Node(3);

    head.left.right = new Node(4);
    head.right.left = new Node(5);
    head.right.right = new Node(6);

    head.left.right.left = new Node(7);
    head.left.right.right = new Node(8);
    head.right.left.left = new Node(9);
    head.right.left.right = new Node(10);

    head.left.right.right.right = new Node(11);
    head.right.left.left.left = new Node(12);

    head.left.right.right.right.left = new Node(13);
    head.left.right.right.right.right = new Node(14);
    head.right.left.left.left.left = new Node(15);
    head.right.left.left.left.right = new Node(16);
    return head;
  }

  /**
   *              -3
   *            /    \
   *          3       -9
   *        /  \     /   \
   *       1   0    2     1
   *          / \
   *         1    6
   *
   */
  public static Node getTree3(){
    Node head = new Node(-3);
    head.left = new Node(3);
    head.right = new Node(-9);
    head.left.left = new Node(1);
    head.left.right = new Node(0);
    head.right.left = new Node(2);
    head.right.right = new Node(1);
    head.left.right.left = new Node(1);
    head.left.right.right = new Node(6);

    return head;

  }

}
