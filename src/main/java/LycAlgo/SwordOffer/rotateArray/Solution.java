package LycAlgo.SwordOffer.rotateArray;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minNumberInRotateArray(new int[]{4, 1, 1, 2, 3}));
        ;
    }

    public int minNumberInRotateArray(int[] array) {
        int l = 0;
        int r = array.length - 1;
        int mid = 0;
        while (array[l] >= array[r]) {
            if (l + 1 == r) {
                return array[r];
            }
            if (array[l] < array[r]) {
                return array[l];
            }
            mid = (l + r) >> 1;
            if (array[mid] == array[l] && array[l] == array[r]) {
                return continuefind(array, l, r);
            }
            if (array[l] < array[mid]) {
                l = mid;
            } else if (array[r] > array[mid]) {
                r = mid;
            }
        }
        return array[mid];
    }

    private int continuefind(int[] array, int l, int r) {
        int min = array[l];
        for (int i = l + 1; i <= r; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
