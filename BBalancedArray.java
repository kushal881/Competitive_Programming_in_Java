import java.util.*;
public class BBalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if ((n / 2) % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int[] a = new int[n];
                int even = 2;
                for (int i = 0; i < n / 2; i++) {
                    a[i] = even;
                    even += 2;
                }
                int odd = 1;
                for (int i = n / 2; i < n - 1; i++) {
                    a[i] = odd;
                    odd += 2;
                }
                a[n - 1] = a[n / 2 - 1] + (n / 2);
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
