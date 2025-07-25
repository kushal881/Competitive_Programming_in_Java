import java.util.Scanner;

public class BBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxBooks = 0;
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += a[right];

            while (sum > t) {
                sum -= a[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
        }

        System.out.println(maxBooks);
    }
}
