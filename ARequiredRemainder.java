import java.util.*;
public class ARequiredRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();

            long k = n - (n - y) % x;
            System.out.println(k);
        }
    }
}
