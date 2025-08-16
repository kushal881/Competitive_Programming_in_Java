import java.util.*;

public class BGiftsFixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            long minA = Arrays.stream(a).min().getAsLong();
            long minB = Arrays.stream(b).min().getAsLong();

            long moves = 0;
            for (int i = 0; i < n; i++) {
                long da = a[i] - minA;
                long db = b[i] - minB;
                moves += Math.max(da, db);
            }
            System.out.println(moves);
        }
    }
}
