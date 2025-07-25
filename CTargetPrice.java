import java.util.*;

public class CTargetPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int totalScore = 0;

            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        int distance = Math.max(Math.abs(i - 4), Math.abs(j - 4));
                        int score = Math.max(0, 5 - distance);
                        totalScore += score;
                    }
                }
            }

            System.out.println(totalScore);
        }
    }
}
