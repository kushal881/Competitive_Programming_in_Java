import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ACherry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            long maxProduct = 0;
            for (int i = 0; i < n - 1; i++) {
                long currentProduct = (long) a[i] * a[i + 1];
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
            pw.println(maxProduct);
        }
        pw.flush();
    }
}