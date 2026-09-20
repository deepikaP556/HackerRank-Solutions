import java.io.*;
import java.util.*;

public class Solution {

    
    public static boolean isMatch(String s, String p) {

        int n = s.length();
        int m = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];

        // Both empty
        dp[0][0] = true;

        // Empty string can be matched by only *
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                // Normal character or ?
                if (pc == '?' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // *
                else if (pc == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        System.out.println(isMatch(s, p) ? 1 : 0);
}
}
