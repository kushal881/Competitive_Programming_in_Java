import java.util.Scanner;

public class AXORwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a ^ b);
        }
    }
}