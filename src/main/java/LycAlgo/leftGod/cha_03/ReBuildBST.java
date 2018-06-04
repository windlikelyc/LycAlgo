package LycAlgo.leftGod.cha_03;

public class ReBuildBST {

  public static boolean isPostArray(int[] arr){
    if (arr == null || arr.length == 0) {
      return false;
    }

    return isPost(arr, 0, arr.length - 1);
  }

  private static boolean isPost(int[] arr, int start, int end) {
    if (start == end) {
      return true;
    }

    int less = -1;
    int more = end;
    for(int i = start ; i < end ; i++) {
      if (arr[end] > arr[i]) {
        less = i;
      }else {
        more = more == end ? i : more;
      }
    }
    if (less == -1 || more == end) {
      return isPost(arr, start, end - 1);
    }
    if (less != more - 1) {
      return false;
    }
    return isPost(arr, start, less) && isPost(arr, more, end - 1);
  }

  public static Node posArrayToBST(int[] array) {
    if (array == null) {
      return null;
    }
    return posToBST(array, 0, array.length - 1);
  }

  private static Node posToBST(int[] array, int start, int end) {
    if (start > end) {
      return null;
    }
    Node head = new Node(array[end]);
    int less = -1;
    int more = end;
    for (int i = start; i <    end ; i++) {
      if (array[end] > array[i]) {
        less = i;
      }else {
        more = more == end ? i : more;
      }
    }
    head.left = posToBST(array, start, less);
    head.right = posToBST(array, more, end - 1);
    return head;
  }


  public static void main(String[] args) {
    posArrayToBST(new int[]{1, 2, 3});
  }


}
