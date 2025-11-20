import java.util.Scanner;

public class BSquareorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int r = (int) Math.sqrt(n);

            if (r * r != n) {
                System.out.println("No");
                continue;
            }

            boolean isPossible = true;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    char ch = s.charAt(i * r + j);
                    boolean isEdge = (i == 0 || i == r - 1 || j == 0 || j == r - 1);

                    if (isEdge) {
                        if (ch != '1') {
                            isPossible = false;
                            break;
                        }
                    } else {
                        if (ch != '0') {
                            isPossible = false;
                            break;
                        }
                    }
                }
                if (!isPossible) break;
            }

            System.out.println(isPossible ? "Yes" : "No");
        }

    }
}
