import java.util.*;

public class AOneandTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int totalTwos = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) totalTwos++;
            }

            int leftTwos = 0;
            int k = -1;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 2) leftTwos++;
                int rightTwos = totalTwos - leftTwos;
                if (leftTwos == rightTwos) {
                    k = i + 1;
                    break;
                }
            }

            System.out.println(k);
        }

    }
}
