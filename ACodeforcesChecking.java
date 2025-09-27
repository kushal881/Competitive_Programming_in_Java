import java.util.Scanner;

public class ACodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "codeforces";
        int t  = sc.nextInt();
        while (t-- > 0) {
            char ch = sc.next().charAt(0);
            int a = 0;
            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    a = 1;
                }
            }
            System.out.println(a == 0 ? "NO" : "YES");
        }
    }
}
