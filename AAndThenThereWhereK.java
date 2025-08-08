import java.util.*;

public class AAndThenThereWhereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int powerOfTwo = Integer.highestOneBit(n);
            int k = powerOfTwo - 1;
            System.out.println(k);
        }

    }
}
