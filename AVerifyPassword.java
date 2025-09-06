import java.util.*;

public class AVerifyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean valid = true;
            int lastDigit = -1;
            char lastChar = 'a' - 1;
            boolean seenLetter = false;

            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    int d = ch - '0';
                    if (seenLetter) {
                        valid = false;
                        break;
                    }
                    if (d < lastDigit) {
                        valid = false;
                        break;
                    }
                    lastDigit = d;
                } else {
                    seenLetter = true;
                    if (ch < lastChar) {
                        valid = false;
                        break;
                    }
                    lastChar = ch;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }
    }
}
