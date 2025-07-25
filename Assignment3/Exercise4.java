package Assignment3;

public class Exercise4 {

    public int maximumSum(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = heights[i];
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] <= heights[i]) {
                    left[i] = Math.max(left[i], left[j] + heights[i]);
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = heights[i];
            for (int j = i + 1; j < n; j++) {
                if (heights[j] <= heights[i]) {
                    right[i] = Math.max(right[i], right[j] + heights[i]);
                }
            }
        }

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, left[i] + right[i] - heights[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Exercise4 mt = new Exercise4();
        int[] heights = {2, 1, 4, 7, 3, 2, 5};
        System.out.println(mt.maximumSum(heights));
    }
}

