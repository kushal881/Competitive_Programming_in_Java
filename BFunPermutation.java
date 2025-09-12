import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BFunPermutation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, pw);
        }
        pw.flush();
    }

    private static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int pValue = Integer.parseInt(st.nextToken());
            pos[pValue] = i;
        }

        int[] q = new int[n];
        for (int v = 1; v <= n; v++) {
            q[pos[v]] = n - v + 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : q) {
            sb.append(val).append(" ");
        }
        pw.println(sb.toString().trim());
    }
}