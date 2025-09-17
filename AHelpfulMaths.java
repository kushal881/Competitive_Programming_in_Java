import java.util.*;

public class AHelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] numbers = input.split("\\+");


        Arrays.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i != numbers.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result.toString());
    }
}
