import java.util.Scanner;
import java.lang.Math;

public class APatrickandShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long d1 = scanner.nextLong();
        long d2 = scanner.nextLong();
        long d3 = scanner.nextLong();

        long option1 = d1 + d2 + d3;
        long option2 = 2 * (d1 + d2);
        long option3 = 2 * (d1 + d3);
        long option4 = 2 * (d2 + d3);

        long minDistance = Math.min(option1, option2);
        minDistance = Math.min(minDistance, option3);
        minDistance = Math.min(minDistance, option4);

        System.out.println(minDistance);

    }
}