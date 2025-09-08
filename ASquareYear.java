import java.util.Scanner;
import java.lang.Math;

public class ASquareYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String s = sc.next();
        int year = Integer.parseInt(s);

        int root = (int) Math.sqrt(year);

        if (root * root == year) {
            int a = 0;
            int b = root;
            System.out.println(a + " " + b);
        } else {
            System.out.println(-1);
        }
    }
}