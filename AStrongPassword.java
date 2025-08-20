import java.util.Scanner;

public class AStrongPassword {

    public static int calculateTypingTime(String p) {
        if (p.isEmpty()) {
            return 0;
        }
        int time = 2;
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) == p.charAt(i - 1)) {
                time += 1;
            } else {
                time += 2;
            }
        }
        return time;
    }

    public static void solve(String s) {
        int maxTime = -1;
        String bestPassword = "";
        int n = s.length();

        for (int i = 0; i <= n; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                StringBuilder sb = new StringBuilder(s);
                sb.insert(i, c);
                String newPassword = sb.toString();

                int currentTime = calculateTypingTime(newPassword);

                if (currentTime > maxTime) {
                    maxTime = currentTime;
                    bestPassword = newPassword;
                }
            }
        }
        System.out.println(bestPassword);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            solve(s);
        }
    }
}