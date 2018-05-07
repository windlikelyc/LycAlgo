package LycAlgo.leftGod.cha_08;

import java.util.HashMap;

public class findMaxTargetArray {
  // 书中有两个例子，一个数组全是正数，一个可以有负数

  // 这个是全部正整数
  public int getMaxLength(int[] arr, int k) {
    if (arr == null || arr.length == 0 || k <= 0) {
      return 0;
    }
    int left = 0;
    int right = 0;
    int sum = arr[0];
    int len = 0;
    while (right < arr.length) {
      if (sum == k) {
        len = Math.max(len, right - left + 1);
        sum -= arr[left++];
      } else if (sum < k) {
        right++;
        if (right == arr.length) {
          break;
        }
        sum += arr[right];
      } else {
        sum -= arr[left++];
      }
    }
    return len;
  }

  // 未排序数组，元素可正可负可为0
  /**
   * map 的意义 key 累加到当前元素的和 value 第一次出现 该累加和的位置
   * 既然我们是求最长的，所以记录最早的就行了
   */
  public int maxLength(int[] arr, int k) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1); //第一次累加出现0的位置是在-1

    int len = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (map.containsKey(sum - k)) {
        len = Math.max(i - map.get(sum - k), len);
      }
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    return len;
  }

  public static void main(String[] args) {
    new findMaxTargetArray().maxLength(new int[]{6}, 6);
  }





}
