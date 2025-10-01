import java.util.*;
import java.io.*;
public class AShortSubstrings {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            String b = br.readLine();
            while (b != null && b.length() == 0) b = br.readLine();
            StringBuilder a = new StringBuilder();
            a.append(b.charAt(0));
            for (int i = 1; i < b.length(); i += 2) a.append(b.charAt(i));
            out.append(a).append('\n');
        }
        System.out.print(out.toString());
    }
}
