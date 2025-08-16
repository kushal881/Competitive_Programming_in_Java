import java.util.*;

public class AReplacingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] a = new int[n];
            boolean allSmall = true;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > d) allSmall = false;
            }

            if (allSmall) {
                System.out.println("YES");
                continue;
            }

            Arrays.sort(a);
            if (a[0] + a[1] <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
