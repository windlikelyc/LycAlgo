package LycAlgo.Problems.selfDividingNum;


import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList<>();
    while(left <= right){
      if(judge(left) == true){
        list.add(left);
      }
      left++;
    }
    return list;

  }

  private boolean judge(int num) {
    //1
    String s = num + "";
    if(s.contains("0")) return false;
    for(int i = 0 ; i< s.length(); i++) {
      if (num % Integer.parseInt(String.valueOf(s.charAt(i))) != 0) {
        return false;
      }
    }
    return true;
  }


}
