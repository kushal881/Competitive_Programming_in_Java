import java.util.Scanner;

public class AWeNeedtheZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int xorSum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            xorSum ^= num;
        }

        if (n % 2 == 0) {
            if (xorSum == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(xorSum);
        }
    }
}