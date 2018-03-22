package LycAlgo.sort;

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
        int[] A = {7, 4, 9, 8, 2, 1, 4, 7, 9, 5};
        quickSort.sort(A,0,9);
        return;

    }

}
