import java.util.*;

public class D1DEraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int ops = 0;
            int i = 0;

            while (i < n) {
                if (s.charAt(i) == 'B') {
                    ops++;
                    i += k;
                } else {
                    i++;
                }
            }

            System.out.println(ops);
        }

    }
}
