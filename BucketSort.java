
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextDouble();

        
        boolean small = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1) {
                small = false;
                break;
            }
        }

        if (small) {
            ArrayList<Double>[] bucket = new ArrayList[n];

            for (int i = 0; i < n; i++)
                bucket[i] = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int index = (int)(arr[i] * n);

                if (index == n)
                    index = n - 1;

                bucket[index].add(arr[i]);
            }

            for (int i = 0; i < n; i++)
                Collections.sort(bucket[i]);

            for (int i = 0; i < n; i++)
                for (double x : bucket[i])
                    System.out.printf("%.2f ", x);
        }
        else {
            
            Arrays.sort(arr);

            for (int i = 0; i < n; i++) {
                if (arr[i] == (int)arr[i])
                    System.out.print((int)arr[i] + " ");
                else
                    System.out.printf("%.2f ", arr[i]);
            }
        }
    }
}
