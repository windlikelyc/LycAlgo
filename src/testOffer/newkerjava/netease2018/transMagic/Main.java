package testOffer.newkerjava.netease2018.transMagic;

import java.util.Scanner;

public class Main {
  private static int Mapn;
  private static int[][] copyMap;

  // dfs求不超过L的最大深度
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Mapn = n;
    int L = scanner.nextInt();
    int[][] map = new int[n][n];
    int[] parent = new int[n - 1];
    for(int i = 0 ; i < n-1 ;i++) {
      parent[i] = scanner.nextInt();
    }
    for (int i = 0; i < parent.length; i++) {
      map[parent[i]][i + 1] = 1;
    }
    copyMap = map;
    // 以上保证没有问题
    int max = -1;
    int cou = 1;
    for(int i = 0 ; i < n;i++) {
      for(int j = i+1 ; j <= n ; j++) {
        if (copyMap[i][j] == 1) {
          cou++;
          copyMap[i][j] = 0;
          max = Math.max(max, dfs(i, j, cou));
          cou--;
        }
      }
    }


    return;
  }

  private static int dfs(int i, int j, int count) {
    for(int a = i;a < Mapn;i++) {
      for(int b = i+1;j< Mapn;b++){
        if (copyMap[i][j] == 1) {
          count++;
          copyMap[i][j] = 0;
          dfs(i, j, copyMap);
          count--;
        }
      }
    }
  }
}
