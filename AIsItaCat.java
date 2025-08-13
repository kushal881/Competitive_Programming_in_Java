import java.util.Scanner;

public class AIsItaCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next().toLowerCase();

            if (s.length() < 4) {
                System.out.println("NO");
                continue;
            }

            if (s.charAt(0) != 'm') {
                System.out.println("NO");
                continue;
            }

            int i = 0;
            while (i < n && s.charAt(i) == 'm') {
                i++;
            }
            if (i == n || s.charAt(i) != 'e') {
                System.out.println("NO");
                continue;
            }

            while (i < n && s.charAt(i) == 'e') {
                i++;
            }
            if (i == n || s.charAt(i) != 'o') {
                System.out.println("NO");
                continue;
            }

            while (i < n && s.charAt(i) == 'o') {
                i++;
            }
            if (i == n || s.charAt(i) != 'w') {
                System.out.println("NO");
                continue;
            }

            while (i < n && s.charAt(i) == 'w') {
                i++;
            }

            if (i == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}