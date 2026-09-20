import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(), B = sc.nextLong();

        long a = A, b = B;
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;

        while (b != 0) {
            long q = a / b;

            long t = a % b;
            a = b;
            b = t;

            t = x0 - q * x1;
            x0 = x1;
            x1 = t;

            t = y0 - q * y1;
            y0 = y1;
            y1 = t;
        }

        long d = a;

        System.out.println(x0 + " " + y0 + " " + d);
    }
}
    
