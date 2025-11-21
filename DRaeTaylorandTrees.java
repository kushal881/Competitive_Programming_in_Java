import java.util.*;
public class DRaeTaylorandTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n];
                for (int i = 0; i < n; i++) {
                    p[i] = sc.nextInt();
                }

                int[] suffixMax = new int[n];
                suffixMax[n - 1] = p[n - 1];
                for (int i = n - 2; i >= 0; i--) {
                    suffixMax[i] = Math.max(p[i], suffixMax[i + 1]);
                }

                boolean possible = true;
                int currentMin = p[0];
                for (int i = 0; i < n - 1; i++) {
                    currentMin = Math.min(currentMin, p[i]);
                    if (currentMin > suffixMax[i + 1]) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
    }
}
