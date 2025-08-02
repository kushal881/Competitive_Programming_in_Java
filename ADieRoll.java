import java.util.*;

public class ADieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();

        int max = Math.max(Y, W);
        int favorable = 7 - max;

        int gcd = gcd(favorable, 6);

        System.out.println((favorable / gcd) + "/" + (6 / gcd));
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
