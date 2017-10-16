package LycAlgo.Problems.SumPairs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lyc on 2017/10/12.
 */
public class MapSum {

    private Map<String, Integer> map = new HashMap();

    /**
     * Initialize your data structure here.
     */
    public MapSum() {

    }

    public void insert(String key, int val) {
        map.put(key, val);
        System.out.print(map);

    }

    public int sum(String prefix) {
        int sum = 0;
        Iterator<Map.Entry<String, Integer>> entris = map.entrySet().iterator();
        while (entris.hasNext()) {
            Map.Entry<String, Integer> a = entris.next();
            if (a.getKey().indexOf(prefix) == 0) {
                sum += a.getValue();
            }
        }

        return sum;
    }

//    @Test
//    public void test() {
//        insert("apple", 3);
//        insert("app", 5);
//        insert("appleoo", 4);
//        System.out.print(sum("app"));
//
//    }


}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
