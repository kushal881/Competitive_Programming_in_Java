import java.util.Scanner;

public class AEquidistantLetters{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        String s = scanner.next();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder pairs = new StringBuilder();
        StringBuilder singles = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 2) {
                pairs.append((char) ('a' + i));
            } else if (freq[i] == 1) {
                singles.append((char) ('a' + i));
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(pairs);
        result.append(pairs);
        result.append(singles);

        System.out.println(result.toString());
    }
}