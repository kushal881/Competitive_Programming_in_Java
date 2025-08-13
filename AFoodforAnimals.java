import java.util.*;

public class AFoodforAnimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long extraDogs = Math.max(0, x - a);
            long extraCats = Math.max(0, y - b);

            if (extraDogs + extraCats <= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
