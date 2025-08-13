import java.util.Scanner;

public class ADeletionsOfTwoAdjacentLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            char c = scanner.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c && i % 2 == 0 && (s.length() - 1 - i) % 2 == 0) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}