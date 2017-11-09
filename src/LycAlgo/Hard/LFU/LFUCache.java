package LycAlgo.Hard.LFU;


import java.util.HashMap;
import java.util.Map;

public class LFUCache {
    private DeListNode head = new DeListNode(-1);
    private Map<Integer,DeListNode> map = new HashMap();
    private int capa;
    public LFUCache(int capacity) {
        head.pre = head;
        head.next = head;
        capa = capacity;
    }
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        DeListNode d = remove(map.get(key));
        map.remove(key);
        setTail(new DeListNode(d.val));
        return d.val;
    }

    public void put(int key, int value) {

        //内存满或者不满，存入旧key
        if (map.containsKey(key)) {
            DeListNode d = remove(map.get(key));
            map.remove(key);
            setTail(new DeListNode(value));
        }
        // 内存未满，存入新key
        else if (!map.containsKey(key)&&map.size()<capa) {
            DeListNode d = new DeListNode(value);
            map.put(key, d);
            setTail(d);
        }
        // 内存已满，存入新key
        else if (!map.containsKey(key) && map.size() == capa) {
            remove(head.next);
            DeListNode d = new DeListNode(value);
            map.put(key, d);
            setTail(d);
        }
    }

    private DeListNode remove(DeListNode wanted) {
        wanted.pre.next = wanted.next;
        wanted.next.pre = wanted.pre;
        wanted.pre = null;
        wanted.next = null;
        return wanted;
    }

    private void setTail(DeListNode d) {
        DeListNode tail = head.pre;
        tail.next = d;
        d.pre = tail;
        head.pre = d;
        d.next = head;
    }
    class DeListNode {
        public int val;
        public DeListNode pre;
        public DeListNode next;
        public DeListNode(int x) { val = x; }
    }

}
