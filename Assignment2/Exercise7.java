package Assignment2;

import java.util.*;

public class Exercise7 {
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        int ans = 0;

        Pair[] arrPos = new Pair[n];
        for (int i = 0; i < n; i++) {
            arrPos[i] = new Pair(arr[i], i);
        }

        Arrays.sort(arrPos, Comparator.comparingInt(p -> p.value));

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i] || arrPos[i].index == i) continue;

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrPos[j].index;
                cycleSize++;
            }

            if (cycleSize > 0) {
                ans += (cycleSize - 1);
            }
        }

        return ans;
    }

    static class Pair {
        int value, index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(minSwaps(arr));
    }
}

