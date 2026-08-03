import java.io.*;
import java.util.*;

public class Triplets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(i>0&&arr[i]==arr[i-1])
                continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target)
                {
                    flag=true;
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;
                    k--;
                    while(j<k&&arr[j]==arr[j-1])
                        j++;
                    while(j<k&&arr[k]==arr[k+1])
                        k--;
                }
                else if(sum<target)
                    j++;
                else
                    k--;
                
            }
        }
        if(flag==false)
            System.out.println("No Triplet Found");
    }
}
