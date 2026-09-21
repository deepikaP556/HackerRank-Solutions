import java.io.*;

import java.util.*;

public class Solution {

public static void main(String[] args) {

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner sc=new Scanner(System.in);

int n1=sc.nextInt();
int n2=sc.nextInt();

int[][] grid=new int[n1][n2];

for(int i=0;i<n1;i++)

    {

for(int j=0;j<n2;j++)

        {

            grid[i][j]=sc.nextInt();

        }

    }

int[][] dp=new int[n1][n2];

for(int i=0;i<n1;i++)

    {

for(int j=0;j<n2;j++)

        {

if(i==0&&j==0)

            dp[i][j]=grid[i][j];

else if(i==0)

            dp[0][j]=grid[0][j]+dp[0][j-1];

else if(j==0)

            dp[i][0]=grid[i][0]+dp[i-1][0];

else

            {

int m1=Math.min(dp[i-1][j],dp[i][j-1]);

int m2=Math.min(m1,dp[i-1][j-1]);

            dp[i][j]=grid[i][j]+m2;

            }

        }

    }

    System.out.print(dp[n1-1][n2-1]);

}

}
