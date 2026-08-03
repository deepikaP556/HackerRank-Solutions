import java.io.*;
import java.util.*;

public class Sequence {
    
    public static int cycle(int n)
    {
        int count=1;
        while(n!=1)
        {
            if(n%2==1)
                n=(3*n)+1;
            else
                n/=2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>j)
        {
            int temp=i;
            i=j;
            j=temp;
        }
        int max=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++)
        {
            int len=cycle(k);
            max=Math.max(max,len);
        }
        System.out.print(i+" "+j+" "+max);
    }
}
