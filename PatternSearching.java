import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.next();
        String pat=sc.next();
        int n=txt.length();
        int m=pat.length();
        int[] z=new int[n];
        for(int i=0;i<n;i++)
        {
            int j=i,k=0;
            while(j<n && k<m && txt.charAt(j)==pat.charAt(k))
            {
                z[i]++;
                j++;
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(z[i]==m)
            System.out.println(i);
        }
    }
}
