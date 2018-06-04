package LycAlgo.sort;

import java.util.Arrays;

public class HeapSort {

    public static void adjustHeap(int[] a, int index, int len) {
        int temp = a[index];
        for (int j = 2 * index + 1; j < len; j = 2 * j + 1) {// 沿关键字较大的孩子结点向下筛选
            if (j + 1 < len && a[j] < a[j + 1])
                ++j; // j为关键字中较大记录的下标
            if (a[j] > temp) {
                a[index] = a[j];
                index = j;
            } else {
                break;
            }
        }
        a[index] = temp;
    }

    public static void heapSort(int[] a) {
        int i;
        for (i = a.length / 2 - 1; i >= 0; i--) {// 构建一个大顶堆
            adjustHeap(a, i, a.length);
        }
        for (i = a.length - 1; i > 0; i--) {// 将堆顶记录和当前未经排序子序列的最后一个记录交换
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustHeap(a, 0, i);// 将a中前i-1个记录重新调整为大顶堆
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 2, 3, 4, 5, 6};
//        int[] A = new int[]{2, 1, 3};
        heapSort(A);
        System.out.println(Arrays.toString(A));
    }

}
