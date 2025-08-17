import java.util.*;

public class BVladandShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] grid = new char[n][n];

            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }

            int minRow = n, maxRow = -1, minCol = n, maxCol = -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        minRow = Math.min(minRow, i);
                        maxRow = Math.max(maxRow, i);
                        minCol = Math.min(minCol, j);
                        maxCol = Math.max(maxCol, j);
                    }
                }
            }

            int height = maxRow - minRow + 1;
            int width = maxCol - minCol + 1;

            if (height == width) {
                System.out.println("SQUARE");
            } else {
                System.out.println("TRIANGLE");
            }
        }
        sc.close();
    }
}
