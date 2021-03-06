package algorithm.Problems.Tire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lyc on 2017/9/14.
 */

/**
 * 字典树是个什么鬼
 * 为啥没听到过
 */
public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Trie trie = new Trie(256);
        dict.forEach(s -> trie.insert(s));
        List<String> res = new ArrayList<>();
        Arrays.stream(sentence.split(" ")).forEach(str -> res.add(trie.getShortestPrefix(str)));
        return res.stream().collect(Collectors.joining(" "));
    }


    class Trie {
        private int R;
        private TrieNode root;

        public Trie(int R) {
            this.R = R;
            root = new TrieNode();
        }

        // Returns the shortest prefix of the word that is there in the trie
        // If no such prefix exists, return the original word
        public String getShortestPrefix(String word) {
            int len = getShortestPrefix(root, word, -1);
            return (len < 1) ? word : word.substring(0, len);
        }

        private int getShortestPrefix(TrieNode root, String word, int res) {
            if (root == null || word.isEmpty()) return 0;
            if (root.isWord) return res + 1;
            return getShortestPrefix(root.next[word.charAt(0)], word.substring(1), res + 1);
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            insert(root, word);
        }

        private void insert(TrieNode root, String word) {
            if (word.isEmpty()) {
                root.isWord = true;
                return;
            }
            if (root.next[word.charAt(0)] == null) root.next[word.charAt(0)] = new TrieNode();
            insert(root.next[word.charAt(0)], word.substring(1));
        }

        private class TrieNode {
            private TrieNode[] next = new TrieNode[R];
            private boolean isWord;
        }
    }
}
