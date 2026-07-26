import java.io.*;
import java.util.*;

public class BucketSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        ArrayList<Double>[] bucket = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int idx = (int)(arr[i] * 10);
            bucket[idx].add(arr[i]);
        }

        for (int i = 0; i < 10; i++) {
            Collections.sort(bucket[i]);
        }

        int index = 0;

        for (int i = 0; i < 10; i++) {
            for (double num : bucket[i]) {
                arr[index++] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", arr[i]);
        }
    }
}