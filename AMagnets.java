import java.util.*;

public class AMagnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = sc.next();
        int count = 1;

        for (int i = 1; i < n; i++) {
            String curr = sc.next();
            if (!curr.equals(ans)) {
                count++;
                ans = curr;
            }
        }

        System.out.println(count);
    }
}
