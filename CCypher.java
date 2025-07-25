import java.util.*;
public class CCypher {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int originalN = n;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < originalN; i++) {
                int a = sc.nextInt();
                for (int j = 0; j < a; j++) {
                    char ch = sc.next().charAt(0);
                    if (ch == 'U') {
                        arr[i] = (arr[i] + 9) % 10;
                    } else {
                        arr[i] = (arr[i] + 1) % 10;
                    }
                }
            }

            for (int k = 0; k < originalN; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
