import java.util.*;

public class BRobinHoodandtheMajorOak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long L = Math.max(1, n - k + 1);

            long oddsUpToN = (n + 1) / 2;
            long oddsUpToLminus1 = ((L - 1) + 1) / 2;
            long oddCount = oddsUpToN - oddsUpToLminus1;

            if (oddCount % 2 == 0)
                out.append("YES\n");
            else
                out.append("NO\n");
        }

        System.out.print(out.toString());
    }
}
