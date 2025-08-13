import java.util.Scanner;

public class AIdealGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            if (k % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}