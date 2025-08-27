import java.util.Scanner;
import java.lang.StringBuilder;

public class ATwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int b_val = (n + 1) - a[i];
            result.append(b_val);
            if (i < n - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}