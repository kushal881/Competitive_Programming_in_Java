import java.util.Scanner;

public class ADominoDisaster{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'U') {
                result.append('D');
            } else if (c == 'D') {
                result.append('U');
            } else {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}