import java.util.*;
public class ARook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char column = s.charAt(0);
            char row = s.charAt(1);

            for (char r = '1'; r <= '8'; r++) {
                if (r != row) {
                    System.out.println("" + column + r);
                }
            }

            for (char c = 'a'; c <= 'h'; c++) {
                if (c != column) {
                    System.out.println("" + c + row);
                }
            }
        }
    }
}
