package Assignment2;

import java.util.*;

public class Exercise14{
    public static int minTimeToMakeDonuts(int N, int[] ranks) {
        int low = 1, high = 1_000_000_000, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMakeDonuts(ranks, N, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canMakeDonuts(int[] ranks, int N, int time) {
        int count = 0;

        for (int r : ranks) {
            int k = 0;
            int t = 2 * time / r;
            int possible = (int)(Math.floor((-1 + Math.sqrt(1 + 4 * (long)t)) / 2));
            count += possible;
            if (count >= N) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] ranks = {1, 2, 3};
        int N = 11;
        System.out.println(minTimeToMakeDonuts(N, ranks));
    }
}

