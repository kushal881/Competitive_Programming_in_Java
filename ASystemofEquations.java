import java.util.Scanner;

public class ASystemofEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        for (int a = 0; a * a <= n; a++) {
            int b = n - a * a;
            if (b >= 0 && a + b * b == m) {
                count++;
            }
        }

        System.out.println(count);
    }
}
