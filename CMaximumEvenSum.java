import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CMaximumEvenSum{

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if ((a + b) % 2 == 0) {
            if (a % 2 == 0) {
                pw.println(Math.max(a + b, a * (b / 2) + 2));
            } else {
                pw.println(Math.max(a + b, a * b + 1));
            }
        } else {
            if (a % 2 != 0 && b > 2 && b % 4 == 0) {
                pw.println(Math.max(a * 2 + b / 2, a * (b / 2) + 2));
            } else {
                pw.println(-1);
            }
        }
    }
}