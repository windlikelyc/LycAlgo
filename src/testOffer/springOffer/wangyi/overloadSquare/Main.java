package testOffer.springOffer.wangyi.overloadSquare;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] left_bottom_x = new int[n];
        int[] left_bottom_y = new int[n];
        int[] right_top_x = new int[n];
        int[] right_top_y = new int[n];

            String[] nums = scanner.nextLine().split(" ");
            for(int j = 0 ; j < n;j++) {
                left_bottom_x[j] = Integer.parseInt(nums[j]);
            }
            String[] nums2 = scanner.nextLine().split(" ");
            for(int j = 0 ; j < n;j++) {
                left_bottom_y[j] = Integer.parseInt(nums2[j]);
            }
            String[] nums3 = scanner.nextLine().split(" ");
            for(int j = 0 ; j < n;j++) {
                right_top_x[j] = Integer.parseInt(nums3[j]);
            }
            String[] nums4 = scanner.nextLine().split(" ");
            for(int j = 0 ; j < n;j++) {
                right_top_y[j] = Integer.parseInt(nums4[j]);
            }
        Map<int[][], Integer> countMap = new HashMap<>();
        int max = 1;
        for(int i = 0 ; i<n;i++) {
            if(i==0){
                countMap.put(new int[][]{{left_bottom_x[i], left_bottom_y[i]}, {right_top_x[i], right_top_y[i]}}, 1);
                continue;
            }
            for (Map.Entry<int[][], Integer> entry : countMap.entrySet()) {
                int aleadyOverload = entry.getValue();
                int[][] point = entry.getKey();
                if (left_bottom_x[i] < point[1][0] && left_bottom_y[i] < point[1][1]&&
                        left_bottom_x[i]> point[0][0] & left_bottom_y[i]>point[0][1]) {
                    int[][] newp = new int[2][2];
                    newp[0][0] = left_bottom_x[i];
                    newp[0][1] = left_bottom_y[i];
                    newp[1][0] =  Math.min(point[1][0], right_top_x[i]);
                    newp[0][1] =  Math.min(point[1][1], right_top_y[i]);
                    countMap.put(newp, aleadyOverload + 1);
                    max = Math.max(max, aleadyOverload + 1);
                }
            }
            countMap.put(new int[][]{{left_bottom_x[i], left_bottom_y[i]}, {right_top_x[i], right_top_y[i]}}, 1);
        }
        System.out.println(max);
    }
}
