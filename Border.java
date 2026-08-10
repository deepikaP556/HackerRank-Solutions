import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int l=0,r=n-1,len=0,maxlen=0;
        String ans=new String();
        while(l<n-1&&r>0)
        {
            String s1=s.substring(0,l+1);
            String s2=s.substring(r,n);
            if(s1.equals(s2))
            {
                len=s1.length();
                if(len>maxlen)
                {
                    maxlen=len;
                    ans=s1;
                }
            }
            l++;
            r--;
        }
        System.out.print(ans);
    }
}
