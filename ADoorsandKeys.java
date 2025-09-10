import java.util.*;
public class ADoorsandKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            Set<Character> keysFound = new HashSet<>();
            boolean possible = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'r' || c == 'g' || c == 'b') {
                    keysFound.add(c);
                } else {
                    char requiredKey = Character.toLowerCase(c);
                    if (!keysFound.contains(requiredKey)) {
                        possible = false;
                        break;
                    }
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
