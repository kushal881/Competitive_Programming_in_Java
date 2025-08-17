import java.util.*;

public class AFalseAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            boolean used = false;
            int buttonTime = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    if (buttonTime > 0) buttonTime--;
                } else {
                    if (buttonTime > 0) {
                        buttonTime--;
                    } else if (!used) {
                        used = true;
                        buttonTime = x - 1;
                    } else {
                        ok = false; 
                        break;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
