package LycAlgo.Problems.GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List> map = new HashMap<>();
        for (String s : strs) {
            StringBuilder sb = new StringBuilder();
            int[] tmp = new int[26];
            for (char c : s.toCharArray()) {
                tmp[(c - 'a')]++;
            }
            for (int i = 0; i < tmp.length; i++) {
                sb.append(tmp[i]);
            }
            map.putIfAbsent(sb.toString(), new ArrayList());
            map.get(sb.toString()).add(s);
        }
        List<List<String>> lists = new ArrayList<>();
        for (List l : map.values()) {
            lists.add(l);
        }
        System.out.println(lists);
        return lists;
    }
}
