package Assignment2;

public class Exercise15 {
    public static int findKthNumber(int M, int N, int K) {
        int low = 1, high = M * N, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countLessEqual(mid, M, N) >= K) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int countLessEqual(int mid, int M, int N) {
        int count = 0;
        for (int i = 1; i <= M; i++) {
            count += Math.min(N, mid / i);
        }
        return count;
    }

    public static void main(String[] args) {
        int M = 3, N = 3, K = 5;
        System.out.println(findKthNumber(M, N, K));
    }
}

