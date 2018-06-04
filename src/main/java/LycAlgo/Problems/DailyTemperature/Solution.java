package LycAlgo.Problems.DailyTemperature;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
  }

  public int[] dailyTemperatures(int[] temperatures) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = temperatures.length - 1; i >= 0; i--) {
      if (i == temperatures.length - 1) {
        map.put(i, 0);
      } else {
        int todayTem = temperatures[i];
        int next = temperatures[i + 1];
        if (todayTem < next) {
          map.put(i, i + 1);
        } else {
          map.put(i, 0);
          int link = i + 1;
          while (map.get(link) != 0) {
            if (todayTem < temperatures[map.get(link)]) {
              map.put(i, map.get(link));
              break;
            } else {
              link = map.get(link);
            }
          }
        }
      }
    }
    int[] ans = new int[temperatures.length];
    for (int i = 0; i < ans.length; i++) {
      if (map.get(i) == 0) {
        ans[i] = 0;
      } else {
        ans[i] = map.get(i) - i;
      }
    }
    return ans;
  }
}
