import java.util.*;

public class BTheThirdSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            long ans = sum - (n - 1L);
            sb.append(ans).append("\n");
        }
        System.out.print(sb.toString());
    }
}
