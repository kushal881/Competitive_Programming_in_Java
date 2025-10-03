import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BBalancedArray {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc, out);
        }
        out.flush();
    }

    public static void solve(FastReader sc, PrintWriter out) {
        int n = sc.nextInt();
        if ((n / 2) % 2 != 0) {
            out.println("NO");
            return;
        }

        out.println("YES");
        long evenSum = 0;
        for (int i = 1; i <= n / 2; i++) {
            long currentEven = i * 2L;
            out.print(currentEven + " ");
            evenSum += currentEven;
        }

        long oddSum = 0;
        for (int i = 1; i < n / 2; i++) {
            long currentOdd = (i * 2L) - 1;
            out.print(currentOdd + " ");
            oddSum += currentOdd;
        }

        out.println(evenSum - oddSum);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}