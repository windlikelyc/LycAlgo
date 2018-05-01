package testOffer.newkerjava.netease2018.fraStr;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    if (s.length() < 2) {
      System.out.println(1);
      return;
    }
    int count = 0;
    int i = 0, j = 0;
    while (i < s.length()) {
      i = j;
      for (; j < s.length(); j++) {
        if (s.charAt(i) != s.charAt(j)) {
          count++;
          break;
        }
      }
    }
    count++;
    double ans = (double) s.length() / (double)count;
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println(df.format(ans));
  }
}
