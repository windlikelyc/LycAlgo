package testOffer.wangyi;

import java.util.Scanner;

public class hechangtuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            for(int i= 1;i<=n;i++) {
                arr[i] = sc.nextInt();
            }

            int kk = sc.nextInt();

            int dd = sc.nextInt();

            long[][] f = new long[n + 1][kk + 1];
            long[][] g = new long[n + 1][kk + 1];
            for (int one = 1 ; one <= n;one++) {
                f[one][1] = arr[one];
                g[one][1] = arr[one];
            }

            for(int k = 2 ; k <= kk ;k++) {
                for (int one = k ; one<=n;one++) {
                    long tmpmax = Long.MIN_VALUE;
                    long tmpmin = Long.MAX_VALUE;
                    for(int left = Math.max(k-1,one-dd);left<=one-1;left++) {
                        if (tmpmax < Math.max(f[left][k - 1] * arr[one], g[left][k - 1] * arr[one])) {
                            tmpmax = Math.max(f[left][k - 1] * arr[one], g[left][k - 1] * arr[one]);
                        }
                        if (tmpmin > Math.min(f[left][k - 1] * arr[one], g[left][k - 1] * arr[one])) {
                            tmpmin = Math.min(f[left][k - 1] * arr[one], g[left][k - 1] * arr[one]);
                        }
                    }
                    f[one][k] = tmpmax;
                    g[one][k] = tmpmin;
                }

            }

            long result = Long.MIN_VALUE;
            for(int one = kk;one<=n;one++) {
                if (result < f[one][kk]) {
                    result = f[one][kk];
                }
            }
            System.out.println(result);

        }
    }


}
