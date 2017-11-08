package LycAlgo.Problems.BaseketBallRound;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     *  ["5","2","C","D","+"]
     Output: 30
     */
    public int calPoints(String[] ops) {

        List<Integer> list = new ArrayList<>();

        int sum = 0;

        for(int i = 0 ; i < ops.length ; i++) {

            if(ops[i].equals("+")){
                int a = list.get(list.size() - 1);
                int b = list.get(list.size() - 2);
                sum += (a + b);
                list.add(a + b);
            }else if(ops[i].equals("C")){
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }else  if(ops[i].equals("D")){
                sum += list.get(list.size() - 1) * 2;
                list.add(list.get(list.size() - 1) * 2);
            }else {
                list.add(Integer.parseInt(ops[i]));
                sum += Integer.parseInt(ops[i]);
            }
        }
        return sum;

    }

    @Test
    public void test(){
        System.out.print(calPoints(new String[]{"5","2","C","D","+"}));;;;

    }
}
