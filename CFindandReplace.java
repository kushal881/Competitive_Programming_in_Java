import java.util.*;

public class CFindandReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] pos = new int[26];
            Arrays.fill(pos, -1);

            boolean ok = true;

            for (int i = 0; i < n; i++) {
                int ch = s.charAt(i) - 'a';
                int parity = i % 2;
                if (pos[ch] == -1) {
                    pos[ch] = parity;
                } else {
                    if (pos[ch] != parity) {
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
