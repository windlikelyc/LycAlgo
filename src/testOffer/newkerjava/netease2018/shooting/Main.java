package testOffer.newkerjava.netease2018.shooting;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x[] = new int[n];
    int y[] = new int[n];
    for (int i = 0; i < n; i++)
      x[i] = scan.nextInt();
    for (int i = 0; i < n; i++)
      y[i] = scan.nextInt();
    scan.close();
    int maxShoot = 0;//在坐标轴上的点
    if (n < 4)
      maxShoot = n;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int X1 = x[j] - x[i];
        int Y1 = y[j] - y[i];
        for (int k = 0; k < n; k++) {
          if (k == i || k == j)
            continue;
          int count = 3;
          for (int l = 0; l < n; l++) {
            if (l == i || l == j || l == k)
              continue;
            int X2 = x[l] - x[k];
            int Y2 = y[l] - y[k];
            int X3 = x[l] - x[i];
            int Y3 = y[l] - y[i];
            if (X1 * X2 + Y1 * Y2 == 0 || X1 * Y3 == X3 * Y1)
              count++;
          }
          if (count > maxShoot)
            maxShoot = count;
        }
      }
    }
    System.out.println(maxShoot);
  }
}
