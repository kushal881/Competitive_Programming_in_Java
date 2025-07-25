import java.util.*;

public class BOrdinaryNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int digits = String.valueOf(n).length();
            int base = Integer.parseInt("1".repeat(digits));
            int extra = n / base;
            int count = (digits - 1) * 9 + extra;
            System.out.println(count);
        }
    }
}
