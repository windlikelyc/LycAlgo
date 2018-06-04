package algorithm.longestSubstringWithoutRepeat;


import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int tmp = 0;
        while (i < s.length()){

            if(!map.containsKey(s.charAt(i))){
                tmp++;
                map.put(s.charAt(i), i);
                max = Math.max(tmp, max);
            }else {
                i = map.get(s.charAt(i));
                map.clear();
                tmp = 0;
            }
            i++;
        }
        return max;
    }

}
