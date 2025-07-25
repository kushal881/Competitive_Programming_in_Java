import java.util.*;

public class AOddSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int totalNumbers = 2 * n;
            int oddCount = 0;
            int evenCount = 0;

            for (int i = 0; i < totalNumbers; i++) {
                int num = sc.nextInt();
                if (num % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }

            if (oddCount == n && evenCount == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
