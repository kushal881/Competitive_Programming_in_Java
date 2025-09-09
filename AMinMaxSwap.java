import java.util.Scanner;

public class AMinMaxSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }

        long maxA = 0;
        long maxB = 0;

        for (int val : a) {
            if (val > maxA) {
                maxA = val;
            }
        }

        for (int val : b) {
            if (val > maxB) {
                maxB = val;
            }
        }

        System.out.println(maxA * maxB);
    }
}