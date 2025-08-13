import java.util.*;

public class AProblemsolvingLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String log = sc.next();

            int[] timeSpent = new int[26];
            for (char ch : log.toCharArray()) {
                timeSpent[ch - 'A']++;
            }

            int solved = 0;
            for (int i = 0; i < 26; i++) {
                int requiredTime = i + 1;
                if (timeSpent[i] >= requiredTime) {
                    solved++;
                }
            }

            System.out.println(solved);
        }
    }
}
