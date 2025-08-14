import java.util.*;

public class AErasingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int firstOne = s.indexOf('1');
            int lastOne = s.lastIndexOf('1');

            int count = 0;
            if (firstOne != -1) {
                for (int i = firstOne; i <= lastOne; i++) {
                    if (s.charAt(i) == '0') count++;
                }
            }
            System.out.println(count);
        }
    }
}
