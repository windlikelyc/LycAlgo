package LycAlgo.utils.Trie;

import org.junit.Test;

import java.util.HashMap;


/**
 * Created by lyc on 2017/9/19.
 */

class TrieNode {

    HashMap<Character, TrieNode> map;
    char character;
    boolean last;

    public TrieNode(char character) {

        this.map = new HashMap<Character, TrieNode>();
        this.character = character;
        this.last = false;
    }

}

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode(' ');
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.map.containsKey(c)) {
                current.map.put(c, new TrieNode(c));
            }
            current = current.map.get(c);
        }
        current.last = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.map.containsKey(c)) {
                return false;
            }
            current = current.map.get(c);
        }
        if (current.last == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean startWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            if (!current.map.containsKey(c)) {
                return false;
            }
            current = current.map.get(c);
        }
        return true;

    }

    @Test
    public void test() {
        Trie trie = new Trie();
        trie.insert("liuyaochen");
        trie.insert("liuyao");
        trie.search("liu");
        trie.search("liuyao");
        System.out.print(Character.getNumericValue('A'));
    }


}
