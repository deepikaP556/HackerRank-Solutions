
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int N = sc.nextInt();

        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        int[] dp = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            dp[i] = 999999;
        }

        dp[0] = 0;

        for (int i = 1; i <= V; i++) {

            for (int j = 0; j < N; j++) {

                if (coin[j] <= i) {

                    dp[i] = Math.min(dp[i],
                                     dp[i - coin[j]] + 1);
                }
            }
        }

        if (dp[V] == 999999)
            System.out.println(-1);
        else
            System.out.println(dp[V]);
    }
}

