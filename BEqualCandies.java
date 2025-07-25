import java.util.*;

public class BEqualCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] candies = new int[n];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                candies[i] = sc.nextInt();
                min = Math.min(min, candies[i]);
            }

            int totalEat = 0;
            for (int i = 0; i < n; i++) {
                totalEat += (candies[i] - min);
            }

            System.out.println(totalEat);
        }
    }
}
