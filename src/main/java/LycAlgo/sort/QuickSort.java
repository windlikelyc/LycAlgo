package LycAlgo.sort;

import java.util.Arrays;

public class QuickSort {

    private int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i+1;
    }
    public void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }




    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] A = {2, 1, 3, 4, 12, 45, 543, 32, 12, 5, 3, 6, 1, 2, 8, 7};
        quickSort.sort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
        return;

    }

}
