import java.util.Scanner;
import java.lang.Math;

public class ACombinationLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String originalState = scanner.next();
        String targetState = scanner.next();

        int totalMoves = 0;

        for (int i = 0; i < n; i++) {
            int currentDigit = Character.getNumericValue(originalState.charAt(i));
            int targetDigit = Character.getNumericValue(targetState.charAt(i));

            int diff = Math.abs(currentDigit - targetDigit);

            int movesForDisk = Math.min(diff, 10 - diff);

            totalMoves += movesForDisk;
        }

        System.out.println(totalMoves);
    }
}