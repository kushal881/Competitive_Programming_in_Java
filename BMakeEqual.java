import java.util.*;

public class BMakeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }

            long avg = sum / n;
            long prefix = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                prefix += arr[i];
                long needed = (i + 1) * avg;
                if (prefix < needed) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
