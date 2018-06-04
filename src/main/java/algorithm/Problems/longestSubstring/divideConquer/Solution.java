package algorithm.Problems.longestSubstring.divideConquer;


import java.util.HashMap;

public class Solution {

    public int longestSubstring(String s, int k) {
        if(s == null || k<0) return 0;
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hashmap.containsKey(c)){
                hashmap.put(c, hashmap.get(c)+1);
            } else {
                hashmap.put(c, 1);
            }
        }

        Character delimiter = null;
        for(Character c: hashmap.keySet()){
            if(hashmap.get(c)<k){
                delimiter = c;
            }
        }

        if(delimiter == null) {
            return s.length();
        }
        int maxlen = 0;
        String[] splits = s.split(""+delimiter);
        for(String str: splits){
            maxlen = Math.max(maxlen, longestSubstring(str,k));
        }
        return maxlen;
    }


}
