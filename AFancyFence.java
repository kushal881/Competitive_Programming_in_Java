import java.util.*;
public class AFancyFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = 180-n;
            if(360%a==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
