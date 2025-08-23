import java.io.*;
import java.util.*;

public class BRobinHoodandtheMajorOak {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long L = Math.max(1, n - k + 1);

            long oddsUpToN = (n + 1) / 2;
            long oddsUpToLminus1 = (L - 1 + 1) / 2;
            long oddCount = oddsUpToN - oddsUpToLminus1;

            if (oddCount % 2 == 0) out.append("YES\n");
            else out.append("NO\n");
        }
        System.out.print(out.toString());
    }
}
