import java.util.*;

public class ARudolfandtheTicket {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            int[] brr = new int[m];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < m; i++) brr[i] = sc.nextInt();

            Arrays.sort(brr);

            int count = 0;
            for (int i = 0; i < n; i++) {
                int limit = k - arr[i];
                count += upperBound(brr, limit);
            }

            System.out.println(count);
        }
    }

    private static int upperBound(int[] arr, int value) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= value) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
