import java.io.*;
import java.util.*;

public class Division {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int did=sc.nextInt();
        int divs=sc.nextInt();
        int[] arr=new int[did+1];
        for(int i=0;i<=did;i++)
        arr[i]=i;
        int low=0;
        int high=did;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]*divs<=did)
            {
                ans=arr[mid];
                low=mid+1;
            }
            else
            high=mid-1;
        }
        System.out.println(ans);
    }
}
