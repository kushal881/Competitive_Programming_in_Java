import java.util.*;

public class AC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;

            while (Math.max(a, b) <= n) {
                if (a < b)
                    a += b;
                else
                    b += a;
                count++;
            }
            System.out.println(count);
        }
    }
}
