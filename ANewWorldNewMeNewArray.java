import java.util.*;
public class ANewWorldNewMeNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            int absK = Math.abs(k);

            if (absK > n * p) {
                System.out.println(-1);
            } else if (k == 0) {
                System.out.println(0);
            } else {
                int ops = (absK + p - 1) / p;
                System.out.println(ops);
            }
        }
    }
}
