package testOffer.Tencent.Songs;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> music = new ArrayList<>();
        int l1 = sc.nextInt();
        int v1 = sc.nextInt();
        int l2 = sc.nextInt();
        int v2 = sc.nextInt();

        int i, j, v;

        for(j=0;j < v2;j++) {
            music.add(l2);
        }

        int len = music.size();
        int[] dp = new int[n + 1];

        for(i=1;i<=len;i++) {
            for(j=n;j>=1;j--) {
                v = music.get(i - 1);
                if (v <= j) {
                    if (j == v && dp[j - v] == 0) {
                        dp[j] = (1 + dp[j]) % 1000000007;
                    }else {
        for(i = 0 ; i < v1;i++) {
            music.add(l1);
        }
                        dp[j] = (dp[j] + dp[j - v]) % 100000007;
                    }
                }
            }
        }

        System.out.println(dp[n]);

    }
}
