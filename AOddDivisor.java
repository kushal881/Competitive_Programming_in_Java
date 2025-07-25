import java.util.*;

public class AOddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();

            // If n is NOT a power of 2, then it has an odd divisor > 1
            if ((n & (n - 1)) != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
