package LycAlgo.leftGod.cha_01;

import java.util.LinkedList;

// 给定数组和整数，返回有多少个子数组满足下列情况
// max(arr[i...j])-min(arr[i...j])<= num
// 其中前者表示子数组最大值，后者表示子数组最小值
public class MaxMinNum {
  public int getNum(int[] arr, int num) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    LinkedList<Integer> qmin = new LinkedList<>();
    LinkedList<Integer> qmax = new LinkedList<>();
    int i = 0;
    int j = 0;
    int res = 0;
    while (i < arr.length) {
      while (j < arr.length) {
        while (!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[j]) {
          qmin.pollLast();
        }
        qmin.addLast(j);
        while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[j]) {
          qmax.pollLast();
        }
        qmax.addLast(j);
        if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
          break;
        }
        j++;
      }
      if (qmin.peekFirst() == i) {
        qmin.pollFirst();
      }
      if (qmax.peekFirst() == i) {
        qmax.pollFirst();
      }
      res += j - i;
      i++;
    }
    return res;
  }

  public static void main(String[] args) {
    new MaxMinNum().getNum(new int[]{2, 1, 3}, 1);
    new MaxMinNum().getNum(new int[]{5, 2, 1,5,1,3,124,51}, 21);
  }

}
