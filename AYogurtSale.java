import java.util.*;

public class AYogurtSale {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int pairs = n / 2;
            int remainder = n % 2;

            int totalCost = pairs * Math.min(2 * a, b) + remainder * a;

            System.out.println(totalCost);
        }
    }
}
