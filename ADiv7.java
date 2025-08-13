import java.io.*;

public class ADiv7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        line = line.trim();
        while (line.length() == 0) {
            line = br.readLine();
            if (line == null) return;
            line = line.trim();
        }
        int t = Integer.parseInt(line);
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine();
            while (s != null && s.trim().length() == 0) s = br.readLine();
            if (s == null) break;
            s = s.trim();

            int len = s.length();
            int orig = Integer.parseInt(s);
            if (orig % 7 == 0) {
                out.append(s).append('\n');
                continue;
            }

            String best = s;
            int bestChanges = Integer.MAX_VALUE;

            for (int x = 0; x <= 999; x += 7) {
                String cand = Integer.toString(x);
                if (cand.length() != len) continue;

                int changes = 0;
                for (int i = 0; i < len; i++) {
                    if (s.charAt(i) != cand.charAt(i)) changes++;
                    if (changes >= bestChanges) break;
                }

                if (changes < bestChanges) {
                    bestChanges = changes;
                    best = cand;
                    if (bestChanges == 0) break;
                }
            }

            out.append(best).append('\n');
        }

        System.out.print(out.toString());
    }
}
