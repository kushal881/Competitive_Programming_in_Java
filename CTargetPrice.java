import java.util.Scanner;
import java.lang.Math;

public class CTargetPrice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int totalScore = 0;
        char[][] target = new char[10][10];
        for (int i = 0; i < 10; i++) {
            target[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (target[i][j] == 'X') {
                    int ring;
                    int rowDist = Math.min(i, 9 - i);
                    int colDist = Math.min(j, 9 - j);
                    ring = Math.min(rowDist, colDist);
                    totalScore += (ring + 1);
                }
            }
        }
        System.out.println(totalScore);
    }
}