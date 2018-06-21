package testDowncase;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
/**
 * @author lyc windlikelyc@gmail.com
 * @date 2018/6/14 15:10
 */
public class AA
{
    public static void main(String[] args) {
        List<Integer> list = getList();
        if (list != null || list.size() > 0) {
            Integer a = null;
            System.out.println(a);
        }
    }

    private static List<Integer> getList(){
        List<Integer> l = new ArrayList<>();
        Integer a = null;
        l.add(a);
        l.add(4);
        return l;
    }
}

