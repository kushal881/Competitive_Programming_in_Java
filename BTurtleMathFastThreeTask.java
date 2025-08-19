import java.util.*;

public class BTurtleMathFastThreeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            int count1 = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if (a[i] % 3 == 1) count1++;
            }

            int rem = (int)(sum % 3);
            int ans = 0;
            if (rem == 0) {
                ans = 0;
            } else if (rem == 1) {
                if (count1 > 0) ans = 1;
                else if (n >= 2) ans = 2;
                else ans = 1;
            } else {
                ans=1;
            }

            System.out.println(ans);
        }
    }
}
