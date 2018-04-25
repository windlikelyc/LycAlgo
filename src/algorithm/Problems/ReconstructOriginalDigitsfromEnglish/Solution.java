package algorithm.Problems.ReconstructOriginalDigitsfromEnglish;

import java.util.*;

public class Solution {
  private boolean hasContinue = true;

  public String originalDigits(String s) {
    // 统计每个字母出现了几次

    Map<Character, Integer> strmap = new HashMap<>();
    for (char c : s.toCharArray()) {
      strmap.put(c, strmap.getOrDefault(c, 0) + 1);
    }

    String[] a = new String[]{"123", "213"};

    String[] digits = new String[]{"zero",
        "one", "two", "three",
        "four", "five", "six",
        "seven", "eight", "nine",
        };

    List<Integer> ans = new ArrayList<>();

    // 快速遍历
    for (int i = 0; i < 10; i++) {
      getAll(i, digits[i], ans, strmap);
    }

    // 低俗遍历
    int i = 0;
    while (hasMore(strmap)) {
      getslow(i, digits[i], ans, strmap);
      i = i + 1 > 9 ? 0 : i + 1;
    }

    Object[] nums = ans.toArray();
    Arrays.sort(nums);
    String sss = "";
    for(int j = 0 ; j < nums.length ;j++) {
      sss += (int) nums[j];
    }
    return sss;

  }

  private void getslow(int i, String digit, List<Integer> ans, Map<Character, Integer> map) {

    for (char c : digit.toCharArray()) {
      if (map.get(c) == null || map.get(c) == 0) {
        return;
      }
    }
    ans.add(i);
    for (char c : digit.toCharArray()) {
      map.put(c, map.get(c) - 1);
    }
  }

  private boolean hasMore(Map<Character, Integer> strmap) {

    for (Map.Entry<Character, Integer>  entry : strmap.entrySet()) {
      if (entry.getValue() != 0) {
        return true;
      }
    }
    return false;
  }

  private void getAll(int k,String digit, List ans,Map<Character,Integer> map) {

    int min = Integer.MAX_VALUE;
    for (char c : digit.toCharArray()) {
      if (map.get(c)!= null && map.get(c) > 1) {
        // min 至少为2
        min = Math.min(min, map.get(c));
     }else {
        return;
      }
    }
    for (char c : digit.toCharArray()) {
      map.put(c, map.get(c) - min);
    }
    for(int i = 0 ; i < min ;i++) {
      ans.add(k);
    }
    return ;
  }

  public static void main(String[] args) {
    System.out.println(
        new Solution().originalDigits("zeroonetwothreefourfivesixseveneightnine")
    );
  }


}
