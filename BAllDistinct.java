import java.util.*;

public class BAllDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Set<Integer> set = new HashSet<>();
            for (int x : arr) set.add(x);

            int distinctCount = set.size();
            int duplicates = n - distinctCount;

            if (duplicates % 2 == 1) {
                distinctCount--;
            }

            System.out.println(distinctCount);
        }
    }
}
