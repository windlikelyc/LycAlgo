package LycAlgo.GeekFork;

import java.util.Scanner;

public class BFS {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    while (T-- != 0) {
      int m = scanner.nextInt();
      int n = scanner.nextInt();
      char[][] chars = new char[m][n];
      boolean[][] tmp = new boolean[m][n];
      int count = 0;
      for (int i = 0; i < m; i++) {
        chars[i] = scanner.next().toCharArray();
      }
      for (int p = 0; p < m; p++) {
        for (int q = 0; q < n; q++) {
          if (!tmp[p][q] && chars[p][q] == 'X') {
            bfs(p, q, chars, tmp);
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }

  private static void bfs(int p, int q, char[][] chars, boolean[][] tmp) {
    int m = chars.length;
    int n = chars[0].length;
    if(p<0 || p>= m || q < 0 || q >= n || chars[p][q] != 'X' || tmp[p][q]) return;
    tmp[p][q] = true;
    bfs(p + 1, q, chars, tmp);
    bfs(p, q + 1, chars, tmp);
    bfs(p - 1, q, chars, tmp);
    bfs(p, q - 1, chars, tmp);
  }
}
