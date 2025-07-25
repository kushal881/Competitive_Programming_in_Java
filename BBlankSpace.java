import java.util.*;

public class BBlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxBlank = 0;
            int currentBlank = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    currentBlank++;
                    maxBlank = Math.max(maxBlank, currentBlank);
                } else {
                    currentBlank = 0;
                }
            }

            System.out.println(maxBlank);
        }

    }
}
