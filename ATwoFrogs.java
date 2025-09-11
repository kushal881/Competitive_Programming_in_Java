import java.util.*;
public class ATwoFrogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int distance = Math.abs(a - b);
        int stepsBetween = distance - 1;

        if (stepsBetween % 2 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
