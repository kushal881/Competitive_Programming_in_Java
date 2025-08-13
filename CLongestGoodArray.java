import java.util.Scanner;

public class CLongestGoodArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long diff = r - l;

            if (diff == 0) {
                System.out.println(1);
                continue;
            }

            long low = 1;
            long high = 200000;
            long ans = 0;

            while (low <= high) {
                long k = low + (high - low) / 2;
                long sumOfDiffs;
                try {
                    sumOfDiffs = (k - 1) * k / 2;
                } catch (ArithmeticException e) {
                    sumOfDiffs = Long.MAX_VALUE;
                }

                if (l + sumOfDiffs <= r) {
                    ans = k;
                    low = k + 1;
                } else {
                    high = k - 1;
                }
            }
            System.out.println(ans);
        }
    }
}