import java.util.*;

public class ALittleNikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if ((n - m) % 2 == 0 && m <= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


    }
}
