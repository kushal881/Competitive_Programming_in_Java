import java.util.*;

public class CWherestheBishop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] board = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String line = sc.next();
                board[i] = line.toCharArray();
            }
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    if (board[i][j] == '#' &&
                            board[i-1][j-1] == '#' &&
                            board[i-1][j+1] == '#') {
                        System.out.println((i+1) + " " + (j+1));
                    }
                }
            }
        }
    }
}
