package LycAlgo.Problems.longestWordInDictionary;

import java.util.HashMap;

public class Node {
    char c;
    HashMap<Character, Node> children = new HashMap();
    int end;

    public Node(char c) {
        this.c = c;
    }
}
