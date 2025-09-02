import java.util.*;
public class BLongLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long maxSum = 0;
            int operations = 0;
            boolean inNegativeBlock = false;

            for (int i = 0; i < n; i++) {
                int currentNum = sc.nextInt();

                maxSum += Math.abs(currentNum);

                if (currentNum < 0 && !inNegativeBlock) {
                    operations++;
                    inNegativeBlock = true;
                } else if (currentNum > 0) {
                    inNegativeBlock = false;
                }
            }
            System.out.println(maxSum + " " + operations);
        }
    }
}
