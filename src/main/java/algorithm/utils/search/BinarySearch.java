package algorithm.utils.search;

public class BinarySearch {

    /**
     * 寻找数组中某一个值
     * @param nums　数组，要求有序
     * @param left　左下标
     * @param right　右下标　
     * @param target　目标值
     * @return 找到返回下标值，没找到返回-1
     */
    public static int searchRecursive(int[] nums, int left, int right, int target) {

        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return searchRecursive(nums, mid + 1, right, target);
            } else {
                return searchRecursive(nums, left , mid-1, target);
            }
        }else {
            return -1;
        }

    }

    /**
     *　循环二叉搜索
     * @param nums
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static int searchLoop(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;

    }
}
