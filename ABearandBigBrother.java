import java.util.*;
public class ABearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt=0;
        while(a<=b){
            cnt++;
            a*=3;
            b*=2;
        }
        System.out.println(cnt);
    }
}
