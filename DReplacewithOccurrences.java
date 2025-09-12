import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class DReplacewithOccurrences{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, pw);
        }
        pw.flush();
    }

    private static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Pair> pairs = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(Integer.parseInt(st.nextToken()), i));
        }

        Collections.sort(pairs);

        int[] a = new int[n];
        boolean possible = true;
        int currentValue = 1;

        int i = 0;
        while (i < n) {
            int k = pairs.get(i).val;

            int j = i;
            while (j < n && pairs.get(j).val == k) {
                j++;
            }
            int count = j - i;

            if (count % k != 0) {
                possible = false;
                break;
            }

            for (int groupIdx = 0; groupIdx < count / k; groupIdx++) {
                for (int itemIdx = 0; itemIdx < k; itemIdx++) {
                    int pairIndex = i + groupIdx * k + itemIdx;
                    int originalIndex = pairs.get(pairIndex).index;
                    a[originalIndex] = currentValue;
                }
                currentValue++;
            }
            i = j;
        }

        if (!possible) {
            pw.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < n; k++) {
                sb.append(a[k]);
                if (k < n - 1) {
                    sb.append(" ");
                }
            }
            pw.println(sb.toString());
        }
    }

    static class Pair implements Comparable<Pair> {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.val, other.val);
        }
    }
}