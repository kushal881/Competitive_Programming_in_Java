import java.util.Scanner;

public class ARudolphandCuttheRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int ropesToCut = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                ropesToCut++;
            }
        }
        System.out.println(ropesToCut);
    }
}