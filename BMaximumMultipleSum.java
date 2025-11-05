import java.util.*;
public class BMaximumMultipleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            if(n<=3) System.out.println(n);
            else System.out.println(2);
        }
    }
}
