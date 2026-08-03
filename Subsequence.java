import java.io.*;
import java.util.*;

public class Subsequence {

    public static void main(String[] args) {
        String s1="hackerrank";
        Scanner sc=new Scanner(System.in);
            int i=0,j=0;
            String s2=sc.next();
            s2=s2.toLowerCase();
            while(i<s1.length()&&j<s2.length())
            {
                if(s1.charAt(i)==s2.charAt(j))
                    i++;
                j++;
            }
            if(i==s1.length())
                System.out.print("YES");
            else
                System.out.print("NO"); 
        
    }
}
