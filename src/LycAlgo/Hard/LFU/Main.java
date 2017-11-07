package LycAlgo.Hard.LFU;

public class Main {
    public static void main(String[] ss) {
        LFUCache lfuCache = new LFUCache(3);
        lfuCache.put(1,1);
        lfuCache.put(2,2);
        lfuCache.put(3,3);
        lfuCache.put(4,4);
        lfuCache.get(4);
        lfuCache.get(3);
        lfuCache.get(2);
        lfuCache.get(1);
        lfuCache.put(5,5);
        lfuCache.get(1);
        lfuCache.get(2);
        lfuCache.get(3);
        lfuCache.get(4);
        lfuCache.get(5);
    }


}
