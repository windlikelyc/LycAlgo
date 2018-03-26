package algorithm.Sort;

public class HeapSort {

    public void HeapSort(int[] arr) {

        int len = arr.length - 1;
        int start = (len- 1)>> 1;
        for(int i = start ; i >= 0 ; i--) {
            Maxfiy(arr, i, len); // 建堆
        }

        for(int i = len; i >0;i--) {
            swap(arr, 0, i);
            Maxfiy(arr, 0,i-1);
        }

    }

    private void Maxfiy(int[] arr, int index, int length) {

        int li = index * 2 + 1;
        int ri = li + 1;
        if (li > length) {
            return;
        }
        int max = li;
        if ((ri <= length) && (arr[ri] > arr[li])){
            max =ri;
        }
        if (arr[index] < arr[max]) {
            swap(arr, index, max);
            Maxfiy(arr, max, length);
        }
    }

    private void swap(int[] arr, int index, int max) {
        int tmp = arr[index];
        arr[index] = arr[max];
        arr[max] = tmp;
    }

    public static void main(String[] args) {

        HeapSort h = new HeapSort();
        int[] arr = new int[]{ 5,6,1,3,4,7,1};
        h.HeapSort(arr);
        return;
    }

}
