package algorithm.Greedy.SplitArray;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by lyc on 2017/9/25.
 */
public class SoulutionGreedy {
    boolean isPossible(int[] nums) {

        Map<Integer, PriorityQueue> backs = new HashMap<>();

        int needMore = 0;

        for (int num : nums) {
            if (!backs.getOrDefault(num - 1, new PriorityQueue()).isEmpty()) {

                int count = (int) backs.get(num - 1).poll();
                if (backs.get(num) == null) backs.putIfAbsent(num, new PriorityQueue());
                backs.get(num).add(++count);
                if (count == 3)
                    needMore--;
            } else {

                if (backs.get(num) == null) backs.putIfAbsent(num, new PriorityQueue());
                backs.get(num).add(1);
                needMore++;
            }
            backs.putIfAbsent(num - 1, new PriorityQueue());
        }
        System.out.print(needMore);

        return needMore == 0;

    }


}
