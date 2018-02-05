package LycAlgo.Problems.maxMinNum;


import java.util.LinkedList;

public class Solution {

    public int getNum(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        LinkedList<Integer> gmin = new LinkedList<>();
        LinkedList<Integer> gmax = new LinkedList<>();
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < arr.length) {
            while (j < arr.length) {
                while (!gmin.isEmpty() && arr[gmin.peekLast()] >= arr[j]) {
                    gmin.pollLast();
                }
                gmin.addLast(j);
                while (!gmax.isEmpty() && arr[gmax.peekLast()] <= arr[j]) {
                    gmax.pollLast();
                }
                gmax.addLast(j);
                if (arr[gmax.getFirst()] - arr[gmin.getFirst()] > num) {
                    break;
                }
                j++;
            }
            if (gmin.peekFirst() == i) {
                gmin.pollFirst();
            }
            if (gmax.peekFirst() == i) {
                gmax.pollFirst();
            }
            res += j - i;
            i++;
        }
        return res;
    }

}
