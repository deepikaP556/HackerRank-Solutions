import java.io.*;
import java.util.*;

public class Solution {
    static int gcd(int a,int b)
{
if(b>a)
return gcd(b,a);
if(b==0)
return a;

return gcd(b,a%b);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j1=sc.nextInt();
        int j2=sc.nextInt();
        int t=sc.nextInt();
        if(t>Math.max(j1,j2))
        System.out.print("NO");
        else
        {
            int gcd=gcd(j1,j2);
            if(t%gcd==0)
            System.out.print("YES");
            else
            System.out.print("NO");
        }
    }
}
