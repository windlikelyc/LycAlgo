package algorithm.utils.ListModule;



import java.util.*;

/**
 * Created by lyc on 2017/9/1.
 */
public class ListTest {
    public static void main(String[]args){


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[]{4, 5, 3, 1, 2, 3, 4};
        for (Integer i : arr) {
            pq.add(i);
        }

        System.out.print(pq.peek());


    }

    public int kthSmallest2(int[][] matrix, int k) {
        // write your code here


        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                s.add(matrix[i][j]);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.peek();
        return -1;
    }

    public int kthSmallest(int[][] matrix, int k) {
        // write your code here
        java.util.List l = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                l.add(matrix[i][j]);
            }
        }
        l.sort(Comparator.naturalOrder());

        return (int) l.get(k);
    }



}
