import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class BUniqueBidAuction{
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

        int[] bids = new int[n];
        int[] counts = new int[n + 1];

        for (int i = 0; i < n; i++) {
            bids[i] = Integer.parseInt(st.nextToken());
            counts[bids[i]]++;
        }

        int winningBid = -1;
        for (int i = 1; i <= n; i++) {
            if (counts[i] == 1) {
                winningBid = i;
                break;
            }
        }

        if (winningBid == -1) {
            sb.append("-1\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (bids[i] == winningBid) {
                sb.append(i + 1).append("\n");
                return;
            }
        }
    }
}