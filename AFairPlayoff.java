import java.util.*;
public class AFairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a= sc.nextInt();
            int b = sc.nextInt();
            int c= sc.nextInt();
            int d = sc.nextInt();
            int W1 = Math.max(a,b);
            int W2 = Math.max(c,d);
            if(W1>Math.min(c,d) && W2>Math.min(a,b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
