package Assignment4;

public class Exercise14 {

    public static int superEggDrop(int n, int k) {
        int[][] dp = new int[k + 1][n + 1];
        int moves = 0;

        while (dp[moves][n] < k) {
            moves++;
            for (int eggs = 1; eggs <= n; eggs++) {
                dp[moves][eggs] = dp[moves - 1][eggs - 1] + dp[moves - 1][eggs] + 1;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 10;
        System.out.println("Minimum number of moves: " + superEggDrop(n, k));
    }
}

