import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AMakeitBeautiful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            if (a[0] == a[n - 1]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.print(a[n - 1] + " ");
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}