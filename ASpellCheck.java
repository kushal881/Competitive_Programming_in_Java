import java.util.*;
public class ASpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n != 5) {
                System.out.println("NO");
                continue;
            }
            char[] a = s.toCharArray();
            Arrays.sort(a);
            if (new String(a).equals("Timru")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
