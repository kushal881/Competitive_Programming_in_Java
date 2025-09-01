import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BSquareorNot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int r = (int) Math.sqrt(n);

            if (r * r != n) {
                pw.println("No");
                continue;
            }

            boolean isPossible = true;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    char characterInString = s.charAt(i * r + j);
                    boolean isOnEdge = (i == 0 || i == r - 1 || j == 0 || j == r - 1);

                    if (isOnEdge) {
                        if (characterInString != '1') {
                            isPossible = false;
                            break;
                        }
                    } else {
                        if (characterInString != '0') {
                            isPossible = false;
                            break;
                        }
                    }
                }
                if (!isPossible) {
                    break;
                }
            }

            if (isPossible) {
                pw.println("Yes");
            } else {
                pw.println("No");
            }
        }
        pw.flush();
        pw.close();
    }
}