package LycAlgo.Problems.brick;

import org.junit.Test;

import java.sql.Array;
import java.util.*;

public class Soltion {

        public int leastBricks(List<List<Integer>> wall) {

            Map<Integer,Integer> all = new HashMap<>();

            int layers = wall.size();
            for (List<Integer> list : wall) {
                int temp = 0;
                for (int i = 0 ; i < list.size()-1 ; i++) {
                    temp += list.get(i);
                    all.put(temp,all.getOrDefault(temp, 0)+1);
                }
            }

            if(all.isEmpty()) return wall.size();
            return  layers - Collections.max(all.values());
        }

}
