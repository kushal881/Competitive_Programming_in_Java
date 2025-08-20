import java.util.*;

public class ADenseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                int x = a[i];
                int y = a[i + 1];

                int big = Math.max(x, y);
                int small = Math.min(x, y);

                while (big > 2 * small) {
                    small *= 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}