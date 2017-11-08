//package LycAlgo.Hard.LFU;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class LFUCache {
//
//    //双向链表的头部，指向最小的FreqNode
//    private FreqNode head = new FreqNode(-1);
//
//    //从key到KeyNode的映射
//    private Map<Integer,DeListNode> thekeymap = new HashMap();
//
//    //从freq到FreqNode的映射
//    private Map<Integer,FreqNode> thefreqmap = new HashMap();
//
//    //缓存容量
//    private int capa;
//
//
//    public LFUCache(int capacity) {
//        head.pre = head;
//        head.next = head;
//        capa = capacity;
//    }
//    public int get(int key) {
//        if(capa<1) return -1;
//        if(!thekeymap.containsKey(key)) return -1;
//        DeListNode d = remove(map.get(key));
//        map.remove(d.key);
//        DeListNode newNode = new DeListNode(d.key, d.val);
//        setTail(newNode);
//        map.put(key, newNode);
//        return d.val;
//    }
//
//    public void put(int key, int value) {
//        //空内存无法存入
//        if(capa<1) return;
//
//        //内存满或者不满，更新key
//        if (thekeymap.containsKey(key)) {
//            int freq = thekeymap.get(key).freq;
//            FreqNode nowfre = thefreqmap.get(freq);
//            if(!(nowfre.next.freq == freq+1)){
//                FreqNode newFre = insertFreqNode(nowfre);
//                remove(thekeymap.get(key));
//                setTail(newFre.head,thekeymap.get(key));
//            }
//        }
//        // 内存未满，存入新key
//        else if (!map.containsKey(key)&&map.size()<capa) {
//            DeListNode d = new DeListNode(key,value);
//            map.put(key, d);
//            setTail(d);
//        }
//        // 内存已满，存入新key
//        else if (!map.containsKey(key) && map.size() == capa) {
//            DeListNode removed = remove(head.next);
//            DeListNode d = new DeListNode(key,value);
//            map.remove(removed.key);
//            map.put(key, d);
//            setTail(d);
//        }
//    }
//
//    private FreqNode insertFreqNode(FreqNode nowfre) {
//        FreqNode newfreqNode = new FreqNode(nowfre.freq + 1);
//        newfreqNode.next = nowfre.next;
//        nowfre.next.pre = newfreqNode;
//        nowfre.next = newfreqNode;
//        newfreqNode.pre = nowfre;
//        return nowfre;
//    }
//
//    private DeListNode remove(DeListNode wanted) {
//        wanted.pre.next = wanted.next;
//        wanted.next.pre = wanted.pre;
//        wanted.pre = null;
//        wanted.next = null;
//        return wanted;
//    }
//
//    private void setTail(DeListNode head,DeListNode d) {
//        DeListNode tail = head.pre;
//        tail.next = d;
//        d.pre = tail;
//        head.pre = d;
//        d.next = head;
//    }
//    class DeListNode {
//        public int key;
//        public int val;
//        //访问频率
//        public int freq;
//        public DeListNode pre;
//        public DeListNode next;
//        public DeListNode(int key,int val) {
//            this.val = val;
//            this.key = key;
//        }
//    }
//
//    class FreqNode{
//        public int freq;
//        public FreqNode pre;
//        public FreqNode next;
//        public DeListNode head = new DeListNode(-1,-1);
//
//        public FreqNode(int fre){
//            freq = fre;
//            head.pre = head;
//            head.next = head;
//        }
//    }
//
//}
