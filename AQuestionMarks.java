import java.util.*;
public class AQuestionMarks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
            } else if (c == 'B') {
                countB++;
            } else if (c == 'C') {
                countC++;
            } else if (c == 'D') {
                countD++;
            }
        }

        int maxScore = 0;
        maxScore += Math.min(countA, n);
        maxScore += Math.min(countB, n);
        maxScore += Math.min(countC, n);
        maxScore += Math.min(countD, n);

        System.out.println(maxScore);
    }
}
