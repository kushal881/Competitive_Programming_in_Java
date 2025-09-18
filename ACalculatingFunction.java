import java.util.*;
public class ACalculatingFunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = (n % 2 == 0) ? n / 2 : -((n + 1) / 2);
        System.out.println(res);
    }
}
