import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] dict = sc.nextLine().split(",");
        String ptn = sc.nextLine();

        String[] ans = new String[n];
        int idx = 0;

        for (int i = 0; i < n; i++) 
        {
            int k = 0;
            for (int j = 0; j < dict[i].length() && k < ptn.length(); j++) 
            {

                char ch = dict[i].charAt(j);
                if (Character.isUpperCase(ch) && ch == ptn.charAt(k))
                    k++;
            }

            if (k == ptn.length()) {
                ans[idx] = dict[i];
                idx++;
            }
        }

        if (idx == 0)
            System.out.println("No match found");
        else {
            Arrays.sort(ans, 0, idx);

            for (int i = 0; i < idx; i++)
                System.out.println(ans[i]);
        }
    }
}
