import java.util.*;

public class BDecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ans = new StringBuilder();

            for (int i = n - 1; i >= 0; ) {
                if (s.charAt(i) == '0') {
                    int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                    ans.append((char) ('a' + num - 1));
                    i -= 3;
                } else {
                    int num = s.charAt(i) - '0';
                    ans.append((char) ('a' + num - 1));
                    i--;
                }
            }

            System.out.println(ans.reverse().toString());
        }
    }
}
