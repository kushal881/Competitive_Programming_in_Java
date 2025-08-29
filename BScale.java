import java.util.Scanner;

public class BScale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = sc.next().toCharArray();
        }

        int newSize = n / k;
        char[][] newGrid = new char[newSize][newSize];

        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                newGrid[i / k][j / k] = grid[i][j];
            }
        }

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                System.out.print(newGrid[i][j]);
            }
            System.out.println();
        }
    }
}