import java.util.*;

public class ALineBreaks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }

            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sum + words[i].length() <= m) {
                    sum += words[i].length();
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
