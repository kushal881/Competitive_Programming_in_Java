import java.util.*;

public class AThreePairwiseMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int[] arr = {x, y, z};
            Arrays.sort(arr);

            if (arr[1] == arr[2]) {
                System.out.println("YES");
                System.out.println(arr[0] + " " + arr[2] + " " + arr[0]);
            } else {
                System.out.println("NO");
            }
        }
    }
}
