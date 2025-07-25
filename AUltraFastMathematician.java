import java.util.*;

public class AUltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }


        System.out.println(result.toString());
    }
}
