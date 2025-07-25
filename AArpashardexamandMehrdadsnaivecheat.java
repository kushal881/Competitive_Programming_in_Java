import java.util.*;
public class AArpashardexamandMehrdadsnaivecheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (n == 0) {
            System.out.println(1);
        } else {
            int[] cycle = {8, 4, 2, 6};
            int index = (int)((n - 1) % 4);
            System.out.println(cycle[index]);
        }
    }
}
