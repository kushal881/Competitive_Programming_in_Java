import java.util.*;

public class AShortSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();

            if (s.equals("abc")) {
                System.out.println("YES");
                continue;
            }

            char[] arr = s.toCharArray();
            boolean found = false;

            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    swap(arr, i, j);
                    if (new String(arr).equals("abc")) {
                        found = true;
                        break;
                    }
                    swap(arr, i, j);
                }
                if (found) break;
            }

            System.out.println(found ? "YES" : "NO");
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
