package Assignment2;

import java.util.*;

public class Exercise6 {
    public static boolean isPossible(int[] stalls, int cows, int dist) {
        int count = 1, lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
            if (count == cows) return true;
        }
        return false;
    }

    public static int largestMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(stalls, cows, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] stalls = new int[n];
            for (int i = 0; i < n; i++) {
                stalls[i] = sc.nextInt();
            }
            System.out.println(largestMinDistance(stalls, c));
        }
    }
}

