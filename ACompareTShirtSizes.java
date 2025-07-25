import java.util.*;

public class ACompareTShirtSizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(compare(a, b));
        }
    }

    static String compare(String a, String b) {
        if (a.equals(b)) return "=";

        char typeA = a.charAt(a.length() - 1);
        char typeB = b.charAt(b.length() - 1);

        if (typeA == typeB) {
            int countA = a.length();
            int countB = b.length();

            if (typeA == 'S') {
                return Integer.compare(countA, countB) < 0 ? ">" : "<";
            } else {
                return Integer.compare(countA, countB) > 0 ? ">" : "<";
            }
        }

        if (typeA == 'M') return typeB == 'S' ? ">" : "<";
        if (typeA == 'S') return "<";
        return ">";
    }
}
