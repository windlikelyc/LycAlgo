package algorithm.Problems.ReconstructOriginalDigitsfromEnglish;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 每次统计最小能够生成几个 digit，最多进行10次便可以统计出所有的
public class Solution2 {

  private String[] digits = new String[]{"zero",
      "one", "two", "three",
      "four", "five", "six",
      "seven", "eight", "nine",
  };

  public String originalDigits(String s) {
    int[] mask = new int[26];
    for (char c : s.toCharArray()) {
      mask [c -'a']++;
    }
    List<String> l = Arrays.asList(digits);
    int index_of_out = -1;
    for (int i = 0; i < 10; i++) {
      // 每次统计出现次数最小且至少为1的digit

    }
    return null;
  }

  public static void main(String[] args) {
    new Solution2().originalDigits("two");
  }
}
