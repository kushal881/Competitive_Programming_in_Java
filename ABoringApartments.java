import java.util.*;
public class ABoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int digit = x % 10;
            int len = String.valueOf(x).length();

            int total = 10 * (digit - 1) + len * (len + 1) / 2;
            System.out.println(total);
        }
    }
}
