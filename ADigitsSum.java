import java.util.*;
public class ADigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = n / 10;
            if (n % 10 == 9) ans++;
            System.out.println(ans);
        }
    }
}
