import java.util.*;
public class ABadTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            if ((long) a[0] + a[1] <= a[n - 1]) {
                System.out.println("1 2 " + n);
            } else {
                System.out.println("-1");
            }
        }
    }
}
