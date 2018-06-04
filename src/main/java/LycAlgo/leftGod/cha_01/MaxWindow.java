package LycAlgo.leftGod.cha_01;


import java.util.Arrays;
import java.util.LinkedList;

// 生成窗口最大数组
public class MaxWindow {

  public int[] getMaxWindow(int[] arr, int w) {

    if (arr == null || arr.length < w || w < 1) {
      return null;
    }
    LinkedList<Integer> linkedList = new LinkedList<>();
    int[] ans = new int[arr.length - w + 1];
    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      while (!linkedList.isEmpty() && arr[linkedList.peekLast()] < arr[i]) {
        linkedList.pollLast();
      }

      linkedList.addLast(i);
      if (!linkedList.isEmpty() && i - linkedList.peekFirst() >= w) {
        linkedList.pollFirst();
      }
      if (i + 1 >= w) {
        ans[index++] = arr[linkedList.peekFirst()];
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        new MaxWindow().getMaxWindow(new int[]{4, 3, 5, 4, 3, 3, 6, 7}, 3)

    ));


  }


}
