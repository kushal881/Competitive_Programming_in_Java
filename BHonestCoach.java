import java.util.*;

public class BHonestCoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }

            Arrays.sort(s);
            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                minDiff = Math.min(minDiff, s[i + 1] - s[i]);
            }

            System.out.println(minDiff);
        }
    }
}
