import java.util.*;
public class BStartup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] brandTotals = new long[k + 1];
            for (int i = 0; i < k; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();
                brandTotals[b] += c;
            }

            List<Long> values = new ArrayList<>();
            for (int i = 1; i <= k; i++) {
                if (brandTotals[i] > 0) {
                    values.add(brandTotals[i]);
                }
            }

            Collections.sort(values, Collections.reverseOrder());

            long maxEarnings = 0;
            int limit = Math.min(n, values.size());
            for (int i = 0; i < limit; i++) {
                maxEarnings += values.get(i);
            }

            System.out.println(maxEarnings);
        }
    }
}
