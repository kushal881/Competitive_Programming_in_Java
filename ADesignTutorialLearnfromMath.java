import java.util.*;
public class ADesignTutorialLearnfromMath {
    static boolean isComposite(int n) {
        if (n < 4) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 4; i < n; i++) {
            if (isComposite(i) && isComposite(n - i)) {
                System.out.println(i + " " + (n - i));
                break;
            }
        }
    }
}
