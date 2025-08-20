import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BRemovePrefix {

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
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Set<Integer> seen = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(a[i])) {
                System.out.println(i + 1);
                return;
            }
            seen.add(a[i]);
        }
        System.out.println(0);
    }
}