import java.util.*;

public class ANewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hours = 0;
        int leftover = 0;

        while (a > 0) {
            hours += a;
            leftover += a;
            a = leftover / b;
            leftover = leftover % b;
        }

        System.out.println(hours);
    }
}
