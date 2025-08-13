import java.util.*;

public class AImboredwithlife {
    public static long factorial(int a) {
        long fact = 1;
        for (int i = 2; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = Math.min(a, b);
        System.out.println(factorial(n));
    }
}
