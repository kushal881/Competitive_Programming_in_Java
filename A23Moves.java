import java.util.*;
public class A23Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            if (n == 1) {
                System.out.println(2);
            } else {
                System.out.println((n + 2) / 3);
            }
        }
    }
}
