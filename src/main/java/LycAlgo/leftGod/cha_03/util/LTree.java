package LycAlgo.leftGod.cha_03.util;

import testAlgo.ch03.Node;

import java.util.LinkedList;

public class LTree {

  public static void createBinTree(int[] array) {
    LinkedList<Node> nodeList = new LinkedList<Node>();
    for (int i = 0; i < array.length; i++)
      nodeList.add(new Node(array[i]));
    for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
      // 左孩子
      nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
      nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
    }
    int lastparentIndex = array.length / 2 - 1;
    nodeList.get(lastparentIndex).left = nodeList
        .get(lastparentIndex * 2 + 1);
    if (array.length % 2 == 1)
      nodeList.get(lastparentIndex).right = nodeList
          .get(lastparentIndex * 2 + 2);

  }

}
