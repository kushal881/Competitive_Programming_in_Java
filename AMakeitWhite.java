import java.util.*;

public class AMakeitWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int firstB = -1, lastB = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    if (firstB == -1) firstB = i;
                    lastB = i;
                }
            }

            int result = lastB - firstB + 1;
            System.out.println(result);
        }

        sc.close();
    }
}
