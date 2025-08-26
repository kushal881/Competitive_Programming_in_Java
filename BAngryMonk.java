import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAngryMonk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[k];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);

            long operations = 0;
            for (int i = 0; i < k - 1; i++) {
                if (a[i] > 1) {
                    operations += (2L * a[i] - 1);
                } else {
                    operations += 1;
                }
            }

            sb.append(operations).append("\n");
        }
        System.out.print(sb);
    }
}