package LycAlgo.Problems.removeKdigits;


import java.util.Stack;

public class Solution {
  public String removeKdigits(String num, int k) {
    int n;
    while(true){
      n = num.length();
      if(n <= k || n == 0) return "0";
      if(k-- == 0) return num;
      if(num.charAt(1) == '0'){
        int firstNotZero = 1;
        while(firstNotZero < num.length()  && num.charAt(firstNotZero) == '0') firstNotZero ++;
        num=num.substring(firstNotZero);
      } else{
        int startIndex = 0;
        while(startIndex < num.length() - 1  && num.charAt(startIndex) <= num.charAt(startIndex + 1)) startIndex ++;
        num=num.substring(0,startIndex)+num.substring(startIndex+1);
      }
    }
  }


}
