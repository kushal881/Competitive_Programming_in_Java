import java.util.*;

public class CWordonthePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            char[][] grid = new char[8][8];

            for (int i = 0; i < 8; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }

            for (int col = 0; col < 8; col++) {
                StringBuilder word = new StringBuilder();
                for (int row = 0; row < 8; row++) {
                    char ch = grid[row][col];
                    if (ch >= 'a' && ch <= 'z') {
                        word.append(ch);
                    }
                }

                if (word.length() > 0) {
                    System.out.println(word.toString());
                    break;
                }
            }
        }
    }
}
