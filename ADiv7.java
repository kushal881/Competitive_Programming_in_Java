import java.util.Scanner;

public class ADiv7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        if (n % 7 == 0) {
            System.out.println(n);
        } else {
            int rem = n % 7;
            int lastDigit = n % 10;
            if (lastDigit >= rem) {
                System.out.println(n - rem);
            } else {
                System.out.println(n + (7 - rem));
            }
        }
    }
}