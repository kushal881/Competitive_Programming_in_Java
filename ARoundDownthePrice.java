import java.util.Scanner;

public class ARoundDownthePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int powerOf10 = 1;
            while (powerOf10 * 10 <= m) {
                powerOf10 *= 10;
            }
            System.out.println(m - powerOf10);
        }
    }
}