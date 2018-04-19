package LycAlgo.leftGod.cha_01;


import java.util.LinkedList;

// 生成窗口最大数组
public class MaxWindow {

  public int[] getMaxWindow(int[] arr, int w) {
    if (arr == null || w < 1 || arr.length < w) {
      return null;
    }

    LinkedList<Integer> gmax = new LinkedList<>();
    int[] res = new int[arr.length - w + 1];
    int index = 0;
    for(int i = 0;i < arr.length)


  }



}
