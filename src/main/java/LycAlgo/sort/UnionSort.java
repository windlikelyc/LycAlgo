package LycAlgo.sort;

import java.util.Arrays;

public class UnionSort {

    public void unionSort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            unionSort(nums, low, mid);
            unionSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }
        while (i <= mid) tmp[k++] = nums[i++];
        while (j <= high) tmp[k++] = nums[j++];
        for(int x = 0 ; x<tmp.length;x++ ) {
            nums[low + x] = tmp[x];
        }
    }

    public static void main(String[] args) {
        UnionSort unionSort = new UnionSort();
        int[] A = new int[]{2, 1, 3, 4, 12, 45, 543, 32, 12, 5, 3, 6, 1, 2, 8, 7};
        unionSort.unionSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
        return;
    }
}
