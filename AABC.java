import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AABC{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            if (n == 1) {
                System.out.println("YES");
            } else if (n == 2 && s.charAt(0) != s.charAt(1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}