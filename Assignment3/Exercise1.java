package Assignment3;

import java.util.*;

public class Exercise1 {
    public int totalStrength(int[] strength) {
        int n = strength.length;
        long mod = (long)1e9 + 7;

        long[] prefixSum = new long[n + 2];
        long[] prefixPrefixSum = new long[n + 3];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = (prefixSum[i] + strength[i]) % mod;
        }
        for (int i = 0; i <= n + 1; i++) {
            prefixPrefixSum[i + 1] = (prefixPrefixSum[i] + prefixSum[i]) % mod;
        }

        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && strength[stack.peek()] >= strength[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && strength[stack.peek()] > strength[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long result = 0;

        for (int i = 0; i < n; i++) {
            int l = left[i];
            int r = right[i];

            long totalLeft = (prefixPrefixSum[i + 1] - prefixPrefixSum[l + 1] + mod) % mod;
            long totalRight = (prefixPrefixSum[r + 1] - prefixPrefixSum[i + 1] + mod) % mod;

            long leftCount = i - l;
            long rightCount = r - i;

            long contrib = ((totalRight * leftCount) % mod - (totalLeft * rightCount) % mod + mod) % mod;
            contrib = (contrib * strength[i]) % mod;

            result = (result + contrib) % mod;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Exercise1 ws = new Exercise1();
        int[] strength = {1, 3, 1, 2};
        System.out.println(ws.totalStrength(strength));
    }
}

