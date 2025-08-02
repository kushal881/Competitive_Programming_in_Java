import java.util.*;
public class APanoramixsPrediction {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int a=0;
        n++;
        while(n>0) {
            int count=0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count = 1;
                    break;
                }
            }
            if(count==0){
                a=n;
                break;
            }
            n++;
        }
        if(a==m) System.out.println("YES");
        else System.out.println("NO");
    }
}
