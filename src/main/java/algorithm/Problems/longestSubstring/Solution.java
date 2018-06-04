package algorithm.Problems.longestSubstring;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestSubstring(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();


        for (char c : s.toCharArray()) {

            if(!map.containsKey(c)){
                map.put(c, 1);
            }else {
                int tmp = map.get(c) + 1;
                map.put(c, tmp);
            }
        }

        int maxlength = 0;
        int cur = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(map.get(s.charAt(i))>=k){
                cur++;
                maxlength = Math.max(maxlength, cur);
            }else {
                cur = 0;
            }
        }


        return maxlength;
    }

}
