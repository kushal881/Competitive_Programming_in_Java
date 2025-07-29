import java.util.*;
public class BWhosOpposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int diff = Math.abs(a - b);
            int n = 2 * diff;

            if (Math.max(a, Math.max(b, c)) > n) {
                System.out.println(-1);
                continue;
            }

            int d = c + diff;
            if (d > n)
                d -= n;

            System.out.println(d);
        }
    }
}
