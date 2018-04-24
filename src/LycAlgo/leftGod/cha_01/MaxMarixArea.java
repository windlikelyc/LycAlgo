package LycAlgo.leftGod.cha_01;

import java.util.Random;
import java.util.Stack;

// 球01矩阵最大子矩阵1的个数
public class MaxMarixArea {

  public int maxRecSize(int[][] map) {
    if (map == null || map.length == 0 || map[0].length == 0) {
      return 0;
    }

    int maxArea = 0;
    int[] height = new int[map[0].length];
    for(int i = 0 ;  i < map.length;i++) {
      for(int j = 0; j < map[0].length;j++) {
        height[j] = map[i][j] == 0 ? 0 : height[j] + 1;
      }
      maxArea = Math.max(maxRecFromBottom(height), maxArea);
    }
    return maxArea;
  }

  public int maxRecFromBottom(int[] height) {
    if (height == null || height.length == 0) {
      return 0;
    }
    int area = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0 ; i < height.length ; i++) {
      while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
        int j = stack.pop();
        int k = stack.isEmpty() ? -1 : stack.peek();
        int curArea = (i - k - 1) * height[j];
        area = Math.max(area, curArea);
      }
      stack.push(i);
    }
    return area;
  }

  public static void main(String[] args) {
    int[][] areas = new int[50][50];

    for(int i = 0 ; i < areas.length;i++) {
      for(int j = 0 ; j < areas[0].length;j++) {
        areas[i][j] = new Random().nextInt(2);
      }
    }

//    new MaxMarixArea().maxRecSize(areas);

    new MaxMarixArea().maxRecFromBottom(new int[]{10, 9, 8, 7, 6, 5});


  }

}
