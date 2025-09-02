import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class AMinimalCoprime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());

            long ans;
            if (l == 1) {
                if (r == 1) {
                    ans = 1;
                } else {
                    ans = r - 1;
                }
            } else {
                ans = r - l;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
