import java.util.*;
public class AFashionabLee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n==1000000000) System.out.println("YES");
            if(n>=4 && 360 % n == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
