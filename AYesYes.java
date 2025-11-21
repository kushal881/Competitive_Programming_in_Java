import java.util.*;

public class AYesYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String base = "";
        while (base.length() < 200) base += "Yes";

        while (t-- > 0) {
            String s = sc.next();
            if (base.contains(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
