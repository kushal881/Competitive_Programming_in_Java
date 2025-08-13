import java.util.*;

public class BJourney{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long cycleSum = a + b + c;

            if (n <= a) {
                System.out.println(1);
                continue;
            } else if (n <= a + b) {
                System.out.println(2);
                continue;
            } else if (n <= cycleSum) {
                System.out.println(3);
                continue;
            }

            long fullCycles = (n - 1) / cycleSum;
            long totalDays = fullCycles * 3;
            long walked = fullCycles * cycleSum;

            if (walked >= n) {
                System.out.println(totalDays);
                continue;
            }
            walked += a;
            totalDays++;
            if (walked >= n) {
                System.out.println(totalDays);
                continue;
            }
            walked += b;
            totalDays++;
            if (walked >= n) {
                System.out.println(totalDays);
                continue;
            }
            walked += c;
            totalDays++;
            System.out.println(totalDays);
        }
    }
}
