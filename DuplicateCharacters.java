import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int checker = 0, j = 0;
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int bit = ch - 'a';
            int mask = 1 << bit;

            if ((checker & mask) != 0) {
                arr[j] = ch;
                j++;
            }

            checker = checker | mask;
        }

        if (j == 0)
            System.out.print("No duplicates");
        else
        {
            for(int k=0;k<j;k++)
            {
                System.out.print(arr[k]+" ");
            }
        }
        
    }
}
