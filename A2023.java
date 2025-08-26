import java.util.*;

public class A2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long product = 1;
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                product *= b[i];
            }

            if (2023 % product != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                long missing = 2023 / product;
                System.out.print(missing);
                for (int i = 1; i < k; i++) System.out.print(" 1");
                System.out.println();
            }
        }
    }
}
