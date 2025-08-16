import java.util.*;

public class CWordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            String[][] players = new String[3][n];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    players[i][j] = sc.next();
                }
            }

            Map<String, Integer> freq = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    freq.put(players[i][j], freq.getOrDefault(players[i][j], 0) + 1);
                }
            }

            int[] scores = new int[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    int count = freq.get(players[i][j]);
                    if (count == 1) scores[i] += 3;
                    else if (count == 2) scores[i] += 1;
                }
            }

            System.out.println(scores[0] + " " + scores[1] + " " + scores[2]);
        }
    }
}
