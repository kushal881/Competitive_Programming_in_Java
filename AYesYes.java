import java.io.*;
import java.util.*;

public class AYesYes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        StringBuilder base = new StringBuilder();
        for (int i = 0; i < 100; i++) base.append("Yes");

        String big = base.toString();

        while (t-- > 0) {
            String s = br.readLine().trim();
            if (big.contains(s)) out.append("YES\n");
            else out.append("NO\n");
        }

        System.out.print(out.toString());
    }
}
