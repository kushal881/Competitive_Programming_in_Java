import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class APrettyPermutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i += 2) {
                    pw.print((i + 1) + " " + i + " ");
                }
                pw.println();
            } else {
                pw.print("3 1 2 ");
                for (int i = 4; i <= n; i += 2) {
                    pw.print((i + 1) + " " + i + " ");
                }
                pw.println();
            }
        }
        pw.flush();
    }
}