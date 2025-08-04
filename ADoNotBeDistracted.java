import java.util.*;

public class ADoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> completed = new HashSet<>();
            boolean suspicious = false;
            char prev = s.charAt(0);
            completed.add(prev);

            for (int i = 1; i < n; i++) {
                char curr = s.charAt(i);
                if (curr != prev) {
                    if (completed.contains(curr)) {
                        suspicious = true;
                        break;
                    }
                    completed.add(curr);
                }
                prev = curr;
            }

            System.out.println(suspicious ? "NO" : "YES");
        }
    }
}
