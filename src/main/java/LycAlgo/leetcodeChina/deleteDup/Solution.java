package LycAlgo.leetcodeChina.deleteDup;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.removeDuplicates(new int[]{1, 1, 2}));

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int length = nums.length;
        int i = 1;
        int ans = 0;

        while (i < length) {
            if (nums[i] == nums[i - 1]) {
                for (int t = i; t < length - 1; t++) {
                    nums[t] = nums[t + 1];
                }
                length--;
                ans++;
            } else {
                i++;
            }
        }
        return nums.length - ans;
    }
}
