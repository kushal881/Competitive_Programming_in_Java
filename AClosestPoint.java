import java.io.*;
import java.util.*;

public class AClosestPoint {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream is) { br = new BufferedReader(new InputStreamReader(is)); }
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int t = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = fs.nextInt();

            int L = -1_000_000;
            int R =  1_000_000;
            for (int i = 0; i < n; i++) {
                int d;
                if (i == 0) d = x[1] - x[0];
                else if (i == n - 1) d = x[n - 1] - x[n - 2];
                else d = Math.min(x[i] - x[i - 1], x[i + 1] - x[i]);

                int curL = x[i] - d;
                int curR = x[i] + d;
                if (curL > L) L = curL;
                if (curR < R) R = curR;
            }

            if (L > R) {
                sb.append("NO\n");
                continue;
            }

            HashSet<Integer> set = new HashSet<>();
            for (int val : x) set.add(val);

            boolean ok = false;
            for (int p = L; p <= R; p++) {
                if (!set.contains(p)) { ok = true; break; }
            }
            sb.append(ok ? "YES\n" : "NO\n");
        }
        System.out.print(sb.toString());
    }
}
