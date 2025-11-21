import java.util.*;
public class C1RenakoAmaoriandXORGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int[] b = new int[n];
                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }

                int diffCount = 0;
                int lastDiffIndex = -1;

                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        diffCount++;
                        lastDiffIndex = i + 1;
                    }
                }

                if (diffCount % 2 == 0) {
                    System.out.println("Tie");
                } else {
                    if (lastDiffIndex % 2 != 0) {
                        System.out.println("Ajisai");
                    } else {
                        System.out.println("Mai");
                    }
                }
            }
    }
}
