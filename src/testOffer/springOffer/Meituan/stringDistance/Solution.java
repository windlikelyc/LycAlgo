package testOffer.springOffer.Meituan.stringDistance;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int a = 0, b = 0;
        int lens = S.length();
        int lent = T.length();
        for (int i = 0; i < lens - lent + 1; i++) {
            if (S.charAt(i) == 'a') a++;
            if (S.charAt(i) == 'b') b++;
        }
        int ans = 0;
        for (int i = 0; i < lent; i++) {
            if (T.charAt(i) == 'a') ans += b;
            else ans += a;
            if (S.charAt(i) == 'a') --a;
            else --b;
            if (i + lens - lent + 1 < S.length() && S.charAt(i + lens - lent + 1) == 'a')
                ++a;
            else
                ++b;
        }
        System.out.println(ans);
    }
}
