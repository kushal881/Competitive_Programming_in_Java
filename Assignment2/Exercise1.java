package Assignment2;

import java.util.Arrays;

public class Exercise1 {
    public static boolean isPossible(int[] arr1, int[] arr2, int k) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (arr1[i] + arr2[n - 1 - i] < k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {7, 8, 9};
        int k = 10;
        System.out.println(isPossible(arr1, arr2, k));
    }
}

