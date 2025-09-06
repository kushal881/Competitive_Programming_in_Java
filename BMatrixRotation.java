import java.util.Scanner;

public class BMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = sc.nextInt();
        matrix[0][1] = sc.nextInt();
        matrix[1][0] = sc.nextInt();
        matrix[1][1] = sc.nextInt();

        boolean possible = false;
        for (int i = 0; i < 4; i++) {
            if (isBeautiful(matrix)) {
                possible = true;
                break;
            }
            matrix = rotate(matrix);
        }

        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isBeautiful(int[][] m) {
        return m[0][0] < m[0][1] &&
                m[1][0] < m[1][1] &&
                m[0][0] < m[1][0] &&
                m[0][1] < m[1][1];
    }

    public static int[][] rotate(int[][] m) {
        int[][] newMatrix = new int[2][2];
        newMatrix[0][0] = m[1][0];
        newMatrix[0][1] = m[0][0];
        newMatrix[1][0] = m[1][1];
        newMatrix[1][1] = m[0][1];
        return newMatrix;
    }
}