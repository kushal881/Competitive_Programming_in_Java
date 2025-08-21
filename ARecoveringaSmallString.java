import java.util.*;
public class ARecoveringaSmallString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String ans = "";

            boolean found = false;
            for (int i = 1; i <= 26 && !found; i++) {
                for (int j = 1; j <= 26 && !found; j++) {
                    int k = n - i - j;
                    if (k >= 1 && k <= 26) {
                        char c1 = (char) ('a' + i - 1);
                        char c2 = (char) ('a' + j - 1);
                        char c3 = (char) ('a' + k - 1);
                        ans = "" + c1 + c2 + c3;
                        found = true;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
