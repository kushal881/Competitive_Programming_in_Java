import java.util.*;

public class AHITtheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] denominations = {100, 20, 10, 5, 1};
        int count = 0;

        for (int bill : denominations) {
            count += n / bill;
            n %= bill;
        }

        System.out.println(count);
    }
}
