package Assignment2;

public class Exercise16 {
    public static int sumOfDigits(long x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static long countNumbers(long n, long d) {
        long low = 1, high = n, ans = n + 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid - sumOfDigits(mid) >= d) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (ans > n) ? 0 : (n - ans + 1);
    }

    public static void main(String[] args) {
        long n = 100;
        long d = 10;
        System.out.println(countNumbers(n, d));
    }
}
