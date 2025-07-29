import java.util.*;

public class ATwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                freq[a]++;
            }
            int score = 0;
            for (int i = 1; i <= n; i++) {
                score += freq[i] / 2;
            }
            System.out.println(score);
        }
    }
}
