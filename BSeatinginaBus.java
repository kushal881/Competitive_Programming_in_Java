import java.util.*;

public class BSeatinginaBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Set<Integer> occupied = new HashSet<>();
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                int seat = a[i];
                if (i == 0) {
                    occupied.add(seat);
                } else {
                    if (occupied.contains(seat - 1) || occupied.contains(seat + 1)) {
                        occupied.add(seat);
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }

    }
}
