import java.util.*;
public class AStrangeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();

            long x_zero_indexed = x - 1;

            long row = x_zero_indexed % n;
            long col = x_zero_indexed / n;

            long ans = row * m + col + 1;

            System.out.println(ans);
        }
    }
}
