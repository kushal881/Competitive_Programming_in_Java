import java.util.*;

public class BSquaresandCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long sqrt = (long) Math.sqrt(n);
            long cbrt = (long) Math.cbrt(n);
            long sixth = countSixthPowers(n);

            long result = sqrt + cbrt - sixth;
            System.out.println(result);
        }
    }

    static long countSixthPowers(long n) {
        long count = 0;
        for (long i = 1; ; i++) {
            long pow6 = i * i;
            pow6 = pow6 * pow6 * i * i;
            if (pow6 > n) break;
            count++;
        }
        return count;
    }
}
