package testOffer.newkerjava.netease2018.MagicCoin;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    StringBuilder sb = new StringBuilder();
    while (n != 0) {
      if (n % 2 == 0) {
        n = n - 2;
        n /= 2;
        sb.append("2");
      }else {
        n = n - 1;
        n /= 2;
        sb.append("1");
      }
    }
    sb.reverse();
    System.out.println(sb.toString());
  }
}
