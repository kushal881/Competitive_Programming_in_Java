import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class ADownloadMoreRAM {

    static class Software {
        int requiredRam;
        int bonusRam;

        public Software(int requiredRam, int bonusRam) {
            this.requiredRam = requiredRam;
            this.bonusRam = bonusRam;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Software[] softwares = new Software[n];
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            softwares[i] = new Software(a[i], b[i]);
        }

        Arrays.sort(softwares, Comparator.comparingInt(s -> s.requiredRam));

        for (int i = 0; i < n; i++) {
            if (k >= softwares[i].requiredRam) {
                k += softwares[i].bonusRam;
            } else {
                break;
            }
        }

        System.out.println(k);
    }
}