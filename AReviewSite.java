import java.util.Scanner;

public class AReviewSite{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int upvotes = 0;
            for (int i = 0; i < n; i++) {
                int r = scanner.nextInt();
                if (r == 1 || r == 3) {
                    upvotes++;
                }
            }
            System.out.println(upvotes);
        }
    }
}