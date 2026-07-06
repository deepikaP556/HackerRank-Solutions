
import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int el=arr[0];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                el=arr[i];
                count++;
            }
            else if(arr[i]==el)
            count++;
            else
            count--;
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==el)
            c++;
        }
        if(c>(n/2))
        System.out.println(el);
        else
        System.out.println(-1);
}
}
