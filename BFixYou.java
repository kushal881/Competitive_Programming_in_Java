import java.util.Scanner;

public class BFixYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            grid[i] = row.toCharArray();
        }

        int changes = 0;

        for (int i = 0; i < n - 1; i++) {
            if (grid[i][m - 1] == 'R') {
                changes++;
            }
        }

        for (int j = 0; j < m - 1; j++) {
            if (grid[n - 1][j] == 'D') {
                changes++;
            }
        }

        System.out.println(changes);
    }
}