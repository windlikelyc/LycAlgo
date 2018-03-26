package algorithm.utils.Trie;


import java.util.HashMap;


/**
 * Created by lyc on 2017/9/19.
 */

/**
 *  trie节点
 *  包括　字符到节点　的map
 *  单个字符
 *  是否是最后一个节点
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

/**
 *  这是一颗字符树
 *  第一次自己做的工具类用到了呢，虽然是自己调用自己
 *  @author lyc
 *
 */
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode(' ');
    }

    /**
     * 插入一个字符串到trie 中
     * @param word
     */
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


}
