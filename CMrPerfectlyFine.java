import java.util.*;

public class CMrPerfectlyFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int best11 = Integer.MAX_VALUE;
            int best10 = Integer.MAX_VALUE;
            int best01 = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int time = sc.nextInt();
                String s = sc.next();
                if (s.equals("11")) {
                    best11 = Math.min(best11, time);
                } else if (s.equals("10")) {
                    best10 = Math.min(best10, time);
                } else if (s.equals("01")) {
                    best01 = Math.min(best01, time);
                }
            }

            int ans = Math.min(best11, (best10 == Integer.MAX_VALUE || best01 == Integer.MAX_VALUE)
                    ? Integer.MAX_VALUE
                    : best10 + best01);

            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }
    }
}
