import java.io.*;
import java.util.*;

public class Merging {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n&&j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else{
               arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
          while(i<n)
        {
            arr3[k]=arr1[i];
                k++;
                i++;
        }
        while(j<m)
        {
            arr3[k]=arr2[j];
                k++;
                j++;
        }
        
        for(int l=0;l<n+m;l++)
        {
            System.out.print(arr3[l]+" ");
        }
        
}
}
