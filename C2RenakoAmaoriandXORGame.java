import java.util.*;
public class C2RenakoAmaoriandXORGame {
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

                int totalXorDiff = 0;
                for (int i = 0; i < n; i++) {
                    totalXorDiff ^= (a[i] ^ b[i]);
                }

                if (totalXorDiff == 0) {
                    System.out.println("Tie");
                } else {
                    int msb = Integer.highestOneBit(totalXorDiff);
                    for (int i = n - 1; i >= 0; i--) {
                        if (((a[i] ^ b[i]) & msb) != 0) {
                            if ((i + 1) % 2 != 0) {
                                System.out.println("Ajisai");
                            } else {
                                System.out.println("Mai");
                            }
                            break;
                        }
                    }
                }
            }
    }
}
