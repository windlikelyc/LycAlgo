package LycAlgo.Problems.longestWordInDictionary;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestWord(new String[]{"w", "wb"});
    }

    public String longestWord(String[] words) {
        Trie trie = new Trie();
        int index = 0;
        for (String word : words) {
            trie.insert(word, ++index); //indexed by 1
        }
        trie.words = words;
        return trie.dfs();
    }


}
