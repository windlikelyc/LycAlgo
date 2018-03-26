package algorithm;

import java.util.*;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(8);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(2);


        int o = main.avg(new int[]{200, 400, 600, 800, 10});

        System.out.println(o);
    }

    public List<Integer> mysort(List<Integer> list) {

        int l = list.size();  // l is length

        for (int i = 0; i < l; i++) {
            int max = Integer.MIN_VALUE;
            int j = i;
            int index = -1;
            for( ; j < l; j++) {
                if(list.get(j) > max){
                    max = Math.max(list.get(j), max);
                    index = j;
                }
            }
            if(index<l&&index!=-1){
                int tmp = list.get(i);
                list.set(i, max);
                list.set(index, tmp);
            }
        }

        return list;
    }


    public int avg(int[] l) {
        int sum = 0;
        for(int i = 0 ; i < l.length ; i++) {
            sum += l[i];
        }
        return sum / l.length;
    }


}
