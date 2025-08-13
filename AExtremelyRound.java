import java.util.*;
public class AExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int len = String.valueOf(n).length();
            int firstDigit = n / (int)Math.pow(10, len - 1);
            int result = (len - 1) * 9 + firstDigit;
            System.out.println(result);
        }
    }
}
