import java.util.Scanner;

public class CMinimumVariedNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int s = scanner.nextInt();
            solve(s);
        }
    }

    private static void solve(int s) {
        StringBuilder resultBuilder = new StringBuilder();
        int remainingSum = s;
        int currentDigit = 9;

        while (remainingSum > 0 && currentDigit > 0) {
            if (remainingSum >= currentDigit) {
                resultBuilder.insert(0, currentDigit);
                remainingSum -= currentDigit;
            }
            currentDigit--;
        }
        System.out.println(resultBuilder.toString());
    }
}