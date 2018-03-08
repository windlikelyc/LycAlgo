package LycAlgo;

import LycAlgo.utils.ListModule.List;
import LycAlgo.utils.ListModule.ListNode;
import LycAlgo.utils.Trie.Trie;
import com.sleepycat.je.tree.IN;
import org.apache.xpath.SourceTree;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 */
public class Main {


    public static void main(String[] args) {

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        map.put(23, 23);
        map.put(12, 12);
        map.put(83, 83);
        map.put(43, 43);
        System.out.println("原数据："+map.toString());
        map.get(3);
        System.out.println("查询存在的某一个："+map.toString());
        map.put(4, 4);
        System.out.println("插入已存在的某一个："+map.toString()); //直接调用已存在的toString方法，不然自己需要用迭代器实现
        map.put(110, 10);
        System.out.println("插入一个原本没存在的："+map.toString());
    }
}
