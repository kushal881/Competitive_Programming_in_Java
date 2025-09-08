import java.util.Scanner;
import java.lang.Math;

public class CMostSimilarWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentDifference = 0;
                String word1 = words[i];
                String word2 = words[j];

                for (int k = 0; k < m; k++) {
                    currentDifference += Math.abs(word1.charAt(k) - word2.charAt(k));
                }

                if (currentDifference < minDifference) {
                    minDifference = currentDifference;
                }
            }
        }
        System.out.println(minDifference);
    }
}