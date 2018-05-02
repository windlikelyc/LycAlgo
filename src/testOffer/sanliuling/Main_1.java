package testOffer.sanliuling;

import java.util.Scanner;

// 画布求面积 AC
public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int ans = 0;
        do {
            T--;
            int n = scanner.nextInt();
            do {
                n--;
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                ans += (x2 - x1 + 1) * (y2 - y1 + 1);
            } while (n != 0);
            System.out.println(ans);
            ans = 0;
        } while (T != 0);
    }
}
