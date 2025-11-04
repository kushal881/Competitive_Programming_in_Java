import java.util.*;
public class AMinimalSquare {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int side = Math.max(Math.max(a, b), 2 * Math.min(a, b));
            int area = side * side;
            System.out.println(area);
        }
    }
}
