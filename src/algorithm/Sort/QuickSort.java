package algorithm.Sort;

public class QuickSort {

    public void quickSort(int[] arr, int head, int tail) {

        if (arr == null || head >= tail) {
            return;
        }

        int i = head, j = tail, provit = arr[(i + j) >> 1];

        while (i <= j) {
            while (arr[i] < provit) {
                i++;
            }
            while (arr[j] > provit) {
                j--;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            } else {
                i++;
            }
        }
        quickSort(arr, head, j);
        quickSort(arr, i, tail);
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] arr = new int[]{ 23,51,12,34,12,45,12,56,2,34,51};
        q.quickSort(arr, 0, arr.length - 1);
        return;
    }

}
