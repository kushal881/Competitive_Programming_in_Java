import java.util.Scanner;

public class ACollatzConjecture{

    private static int k;
    private static long x;
    private static long answer;
    private static boolean found;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        k = sc.nextInt();
        x = sc.nextLong();
        found = false;

        findPredecessor(x, k);

        System.out.println(answer);
    }

    public static void findPredecessor(long current, int stepsLeft) {
        if (found) {
            return;
        }
        if (stepsLeft == 0) {
            answer = current;
            found = true;
            return;
        }

        if ((current - 1) % 3 == 0) {
            long prevOdd = (current - 1) / 3;
            if (prevOdd > 0 && prevOdd % 2 != 0) {
                findPredecessor(prevOdd, stepsLeft - 1);
            }
        }

        if (found) {
            return;
        }

        long prevEven = current * 2;
        findPredecessor(prevEven, stepsLeft - 1);
    }
}