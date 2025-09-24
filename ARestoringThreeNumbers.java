import java.util.*;
public class ARestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t = Math.max(Math.max(a,b),Math.max(c,d));
        int x1 = Math.min(a,b)+Math.min(c,d) - t;
        int x2 = Math.min(a,b)-x1;
        int x3 = t-(x1+x2);
        System.out.println(x1+" "+x2+" "+x3);
    }
}
