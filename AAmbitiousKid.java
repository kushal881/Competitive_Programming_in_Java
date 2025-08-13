import java.util.*;

public class AAmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int minAbs = Integer.MAX_VALUE;
        boolean hasZero = false;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                hasZero = true;
            }
            minAbs = Math.min(minAbs, Math.abs(x));
        }

        if (hasZero) {
            System.out.println(0);
        } else {
            System.out.println(minAbs);
        }
    }
}
