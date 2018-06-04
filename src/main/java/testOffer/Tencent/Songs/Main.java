package testOffer.Tencent.Songs;

import java.util.Scanner;

public class Main {


    public static long ans = 0;
    public static long s_x = 0;
    public static long s_y = 0;
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();

        int A = scanner.nextInt();
        int X = scanner.nextInt();
        s_x = X;
        int B = scanner.nextInt();
        int Y = scanner.nextInt();
        s_y = Y;

        int count_a = 0;
        int count_b = 0;

        find(K, A, B, count_a, count_b );
        System.out.println(ans%1000000007);
    }

    private static void find(int mtarget, int a, int b, int count_a, int count_b) {

            for(int i = 1;i <= s_x;i++) {
                int target = mtarget- i * a;
                count_a++;
                count_b = 0;
                    for(int j= 1; j <= s_y;j++) {
                        if (target - j * s_y < 0) {
                            break;
                        }
                        target -= j * s_y;
                        count_b++;
                        if (target == 0) {
                            ans += count_a * s_x * count_b * s_y;
                        }
                    }
            }
    }

}
