import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BYetAnotherBookshelf{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            solve(br, sb);
        }
        System.out.print(sb.toString());
    }

    private static void solve(BufferedReader br, StringBuilder sb) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int firstBook = -1;
        int lastBook = -1;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (a[i] == 1) {
                if (firstBook == -1) {
                    firstBook = i;
                }
                lastBook = i;
            }
        }

        if (firstBook == -1 || firstBook == lastBook) {
            sb.append("0\n");
            return;
        }

        int zeroCount = 0;
        for (int i = firstBook; i < lastBook; i++) {
            if (a[i] == 0) {
                zeroCount++;
            }
        }
        sb.append(zeroCount).append("\n");
    }
}