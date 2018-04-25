package testOffer.springOffer.wangyi._2019school.bags;

import java.util.Scanner;

public class Solution {

    // n袋零食，i袋体积为v[i]，放入w的背包中，问有几种放法
    private static int count = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            count = 0;
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] nums = new int[n];

            long sum = 0;
            
            for(int i = 0 ; i < n;i++) {
                nums[i] = scanner.nextInt();
                sum += nums[i];
            }
            if (sum <= total) {
                System.out.println((int)Math.pow(2,n));
            }else {
                dfs(0, 0, n, nums, total);
                System.out.println(count+1);
            }
            
        }

    }

    private static void dfs(long sum, int cur, int n, int[] nums, int total) {

        if (cur < n) {
            if (sum > total) {
                return;
            }

            // 不添加这件零食
            dfs(sum,cur+1,n,nums,total);

            // 添加

            if (sum + nums[cur] <= total) {
                count++;
                dfs(sum + nums[cur], cur + 1, n, nums, total);

            }



        }

    }
}
