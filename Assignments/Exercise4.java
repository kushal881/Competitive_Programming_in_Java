package Assignments;
import java.util.*;
public class Exercise4 {
    public static int[] findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;

        while (s < n - 1 && arr[s] <= arr[s + 1]) s++;
        if (s == n - 1) return new int[]{0, 0};

        while (e > 0 && arr[e] >= arr[e - 1]) e--;

        int min = arr[s], max = arr[s];
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        while (s > 0 && arr[s - 1] > min) s--;
        while (e < n - 1 && arr[e + 1] < max) e++;

        return new int[]{s, e};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        int[] result = findUnsortedSubarray(arr);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
