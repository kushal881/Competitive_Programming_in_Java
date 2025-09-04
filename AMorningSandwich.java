import java.util.Scanner;
import java.lang.Math;

public class AMorningSandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int b = sc.nextInt();
        int c = sc.nextInt();
        int h = sc.nextInt();

        int totalFillings = c + h;

        int fillingsSupportedByBread = b - 1;

        int actualFillingsUsed = Math.min(totalFillings, fillingsSupportedByBread);

        int maxLayers = 2 * actualFillingsUsed + 1;

        System.out.println(maxLayers);
    }
}